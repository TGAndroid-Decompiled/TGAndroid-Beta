package org.telegram.ui;
public final class of1 implements Runnable {
    public final int f39874a;
    public final vf1 f39875b;
    public final byte[] f39876c;

    public of1(vf1 vf1Var, byte[] bArr, int i10) {
        this.f39874a = i10;
        this.f39875b = vf1Var;
        this.f39876c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f39874a) {
            case 0:
                vf1.Y(this.f39875b, this.f39876c);
                return;
            default:
                vf1 vf1Var = this.f39875b;
                vf1Var.w0();
                vf1Var.V = this.f39876c;
                vf1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                vf1 vf1Var2 = new vf1(9, vf1Var.U);
                vf1Var2.H = vf1Var.H;
                vf1Var2.G = vf1Var.G;
                vf1Var.presentFragment(vf1Var2, true);
                return;
        }
    }
}
