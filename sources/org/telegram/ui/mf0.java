package org.telegram.ui;
public final class mf0 implements org.telegram.ui.ActionBar.a2 {
    public final int f38619a;
    public final xf0 f38620b;

    public mf0(xf0 xf0Var, int i10) {
        this.f38619a = i10;
        this.f38620b = xf0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f38619a) {
            case 0:
                xf0 xf0Var = this.f38620b;
                xf0Var.c(true);
                xf0Var.f42934s0.u1(0, true, null, true);
                return;
            default:
                this.f38620b.f42934s0.u1(0, true, null, true);
                return;
        }
    }
}
