package org.telegram.ui;
public final class mf0 implements org.telegram.ui.ActionBar.a2 {
    public final int f38585a;
    public final xf0 f38586b;

    public mf0(xf0 xf0Var, int i10) {
        this.f38585a = i10;
        this.f38586b = xf0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f38585a) {
            case 0:
                xf0 xf0Var = this.f38586b;
                xf0Var.c(true);
                xf0Var.f42875s0.u1(0, true, null, true);
                return;
            default:
                this.f38586b.f42875s0.u1(0, true, null, true);
                return;
        }
    }
}
