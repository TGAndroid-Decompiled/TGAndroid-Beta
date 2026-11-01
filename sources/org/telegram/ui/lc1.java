package org.telegram.ui;
public final class lc1 implements Runnable {
    public final int f39191a;
    public final rc1 f39192b;
    public final byte[] f39193c;

    public lc1(rc1 rc1Var, byte[] bArr, int i10) {
        this.f39191a = i10;
        this.f39192b = rc1Var;
        this.f39193c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f39191a) {
            case 0:
                rc1.d0(this.f39192b, this.f39193c);
                return;
            default:
                rc1 rc1Var = this.f39192b;
                rc1Var.B0();
                rc1Var.V = this.f39193c;
                rc1Var.getMessagesController().h4(0L, "VALIDATE_PASSWORD");
                rc1 rc1Var2 = new rc1(9, rc1Var.U);
                rc1Var2.H = rc1Var.H;
                rc1Var2.G = rc1Var.G;
                rc1Var.presentFragment(rc1Var2, true);
                return;
        }
    }
}
