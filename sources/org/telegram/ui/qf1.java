package org.telegram.ui;
public final class qf1 implements Runnable {
    public final int f40425a;
    public final xf1 f40426b;
    public final byte[] f40427c;

    public qf1(xf1 xf1Var, byte[] bArr, int i10) {
        this.f40425a = i10;
        this.f40426b = xf1Var;
        this.f40427c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f40425a) {
            case 0:
                xf1.Y(this.f40426b, this.f40427c);
                return;
            default:
                xf1 xf1Var = this.f40426b;
                xf1Var.w0();
                xf1Var.V = this.f40427c;
                xf1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                xf1 xf1Var2 = new xf1(9, xf1Var.U);
                xf1Var2.H = xf1Var.H;
                xf1Var2.G = xf1Var.G;
                xf1Var.presentFragment(xf1Var2, true);
                return;
        }
    }
}
