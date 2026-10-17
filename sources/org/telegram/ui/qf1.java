package org.telegram.ui;
public final class qf1 implements Runnable {
    public final int f40419a;
    public final xf1 f40420b;
    public final byte[] f40421c;

    public qf1(xf1 xf1Var, byte[] bArr, int i10) {
        this.f40419a = i10;
        this.f40420b = xf1Var;
        this.f40421c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f40419a) {
            case 0:
                xf1.Y(this.f40420b, this.f40421c);
                return;
            default:
                xf1 xf1Var = this.f40420b;
                xf1Var.w0();
                xf1Var.V = this.f40421c;
                xf1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                xf1 xf1Var2 = new xf1(9, xf1Var.U);
                xf1Var2.H = xf1Var.H;
                xf1Var2.G = xf1Var.G;
                xf1Var.presentFragment(xf1Var2, true);
                return;
        }
    }
}
