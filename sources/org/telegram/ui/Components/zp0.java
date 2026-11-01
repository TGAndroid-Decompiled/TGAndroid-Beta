package org.telegram.ui.Components;
public final class zp0 implements Runnable {
    public final int f33203a;
    public final au0 f33204b;
    public final int f33205c;

    public zp0(au0 au0Var, int i10, int i11) {
        this.f33203a = i11;
        this.f33204b = au0Var;
        this.f33205c = i10;
    }

    @Override
    public final void run() {
        switch (this.f33203a) {
            case 0:
                this.f33204b.o1(this.f33205c);
                return;
            case 1:
                au0 au0Var = this.f33204b;
                au0Var.W0(au0Var.f24568x1, au0Var.l1, this.f33205c);
                return;
            case 2:
                this.f33204b.n1(this.f33205c, false);
                return;
            case 3:
                this.f33204b.o1(this.f33205c);
                return;
            default:
                au0 au0Var2 = this.f33204b;
                au0Var2.X0(au0Var2.f24568x1, au0Var2.l1, this.f33205c);
                return;
        }
    }
}
