package org.telegram.ui;
public final class nc1 implements Runnable {
    public final int f39907a;
    public final tc1 f39908b;
    public final byte[] f39909c;

    public nc1(tc1 tc1Var, byte[] bArr, int i10) {
        this.f39907a = i10;
        this.f39908b = tc1Var;
        this.f39909c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f39907a) {
            case 0:
                tc1.c0(this.f39908b, this.f39909c);
                return;
            default:
                tc1 tc1Var = this.f39908b;
                tc1Var.A0();
                tc1Var.V = this.f39909c;
                tc1Var.getMessagesController().h4(0L, "VALIDATE_PASSWORD");
                tc1 tc1Var2 = new tc1(9, tc1Var.U);
                tc1Var2.H = tc1Var.H;
                tc1Var2.G = tc1Var.G;
                tc1Var.presentFragment(tc1Var2, true);
                return;
        }
    }
}
