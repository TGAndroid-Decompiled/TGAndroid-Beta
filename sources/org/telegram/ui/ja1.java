package org.telegram.ui;
public final class ja1 implements Runnable {
    public final int f46583a;
    public final ra1 f46584b;
    public final byte[] f46585c;

    public ja1(ra1 ra1Var, byte[] bArr, int i3) {
        this.f46583a = i3;
        this.f46584b = ra1Var;
        this.f46585c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f46583a) {
            case 0:
                ra1.d0(this.f46584b, this.f46585c);
                return;
            default:
                ra1 ra1Var = this.f46584b;
                ra1Var.B0();
                ra1Var.W = this.f46585c;
                ra1Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
                ra1 ra1Var2 = new ra1(9, ra1Var.V);
                ra1Var2.I = ra1Var.I;
                ra1Var2.H = ra1Var.H;
                ra1Var.presentFragment(ra1Var2, true);
                return;
        }
    }
}
