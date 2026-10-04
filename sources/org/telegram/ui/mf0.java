package org.telegram.ui;
public final class mf0 implements org.telegram.ui.ActionBar.a2 {
    public final int f38584a;
    public final xf0 f38585b;

    public mf0(xf0 xf0Var, int i10) {
        this.f38584a = i10;
        this.f38585b = xf0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f38584a) {
            case 0:
                xf0 xf0Var = this.f38585b;
                xf0Var.c(true);
                xf0Var.f42874s0.u1(0, true, null, true);
                return;
            default:
                this.f38585b.f42874s0.u1(0, true, null, true);
                return;
        }
    }
}
