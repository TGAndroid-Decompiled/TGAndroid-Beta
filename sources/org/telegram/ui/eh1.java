package org.telegram.ui;
public final class eh1 implements Runnable {
    public final int f37109a;
    public final kh1 f37110b;
    public final byte[] f37111c;

    public eh1(kh1 kh1Var, byte[] bArr, int i10) {
        this.f37109a = i10;
        this.f37110b = kh1Var;
        this.f37111c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f37109a) {
            case 0:
                kh1.Y(this.f37110b, this.f37111c);
                return;
            default:
                kh1 kh1Var = this.f37110b;
                kh1Var.w0();
                kh1Var.V = this.f37111c;
                kh1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                kh1 kh1Var2 = new kh1(9, kh1Var.U);
                kh1Var2.H = kh1Var.H;
                kh1Var2.G = kh1Var.G;
                kh1Var.presentFragment(kh1Var2, true);
                return;
        }
    }
}
