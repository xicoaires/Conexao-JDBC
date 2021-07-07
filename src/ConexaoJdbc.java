import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoJdbc {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "PROJETOJAVA2";
		String password = "12345";
		
		try {
			Connection conexao = DriverManager.getConnection(url, user, password);
			System.out.println("Conexão OK!");
		} catch (SQLException e) {
			System.out.println("Não foi possível conectar");
		}
	}
}