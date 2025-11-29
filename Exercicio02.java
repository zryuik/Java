//somando em Java

public class Exercicio02 {
    public static void main(String[] args) {
        // criando variáveis
        int num1 = 5;
        int num2 = 10;

        // somando os valores
        int soma = num1 + num2;
        int dim = num1 - num2;
        int multi = num1 * num2;
        int div = num1 / num2;
        
        System.out.println("A soma entre " + num1 + " e " + num2 + " é " + soma);
        System.out.println("A diminuição entre " + num1 + " e " + num2 + " é " + dim);
        System.out.println("A multiplicação entre " + num1 + " e " + num2 + " é " + multi);
        System.out.println("A divisão entre " + num1 + " e " + num2 + " é " + div);
        System.out.println("========= FIM! =========");
        
    }
}