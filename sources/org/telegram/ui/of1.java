package org.telegram.ui;
public final class of1 implements Runnable {
    public final int f39883a;
    public final vf1 f39884b;
    public final byte[] f39885c;

    public of1(vf1 vf1Var, byte[] bArr, int i10) {
        this.f39883a = i10;
        this.f39884b = vf1Var;
        this.f39885c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f39883a) {
            case 0:
                vf1.Y(this.f39884b, this.f39885c);
                return;
            default:
                vf1 vf1Var = this.f39884b;
                vf1Var.w0();
                vf1Var.V = this.f39885c;
                vf1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                vf1 vf1Var2 = new vf1(9, vf1Var.U);
                vf1Var2.H = vf1Var.H;
                vf1Var2.G = vf1Var.G;
                vf1Var.presentFragment(vf1Var2, true);
                return;
        }
    }
}
