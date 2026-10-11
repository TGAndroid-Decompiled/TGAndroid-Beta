package org.telegram.ui.Components;
public final class i7 implements Runnable {
    public final int f27201a;
    public final l8 f27202b;
    public final q80 f27203c;

    public i7(l8 l8Var, q80 q80Var, int i10) {
        this.f27201a = i10;
        this.f27202b = l8Var;
        this.f27203c = q80Var;
    }

    @Override
    public final void run() {
        switch (this.f27201a) {
            case 0:
                l8 l8Var = this.f27202b;
                l8Var.getClass();
                this.f27203c.u();
                l8Var.u0(1);
                return;
            case 1:
                l8 l8Var2 = this.f27202b;
                l8Var2.getClass();
                this.f27203c.u();
                l8Var2.u0(2);
                return;
            case 2:
                l8 l8Var3 = this.f27202b;
                l8Var3.getClass();
                this.f27203c.u();
                l8Var3.u0(4);
                return;
            case 3:
                l8 l8Var4 = this.f27202b;
                l8Var4.getClass();
                this.f27203c.u();
                l8Var4.u0(7);
                return;
            default:
                l8.s(this.f27202b, this.f27203c);
                return;
        }
    }
}
