package org.telegram.ui;
public final class eh1 implements Runnable {
    public final int f37114a;
    public final kh1 f37115b;
    public final byte[] f37116c;

    public eh1(kh1 kh1Var, byte[] bArr, int i10) {
        this.f37114a = i10;
        this.f37115b = kh1Var;
        this.f37116c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f37114a) {
            case 0:
                kh1.Y(this.f37115b, this.f37116c);
                return;
            default:
                kh1 kh1Var = this.f37115b;
                kh1Var.w0();
                kh1Var.V = this.f37116c;
                kh1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                kh1 kh1Var2 = new kh1(9, kh1Var.U);
                kh1Var2.H = kh1Var.H;
                kh1Var2.G = kh1Var.G;
                kh1Var.presentFragment(kh1Var2, true);
                return;
        }
    }
}
