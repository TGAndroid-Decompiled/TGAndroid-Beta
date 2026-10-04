package org.telegram.ui;
public final class mf0 implements org.telegram.ui.ActionBar.a2 {
    public final int f38590a;
    public final xf0 f38591b;

    public mf0(xf0 xf0Var, int i10) {
        this.f38590a = i10;
        this.f38591b = xf0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f38590a) {
            case 0:
                xf0 xf0Var = this.f38591b;
                xf0Var.c(true);
                xf0Var.f42882s0.u1(0, true, null, true);
                return;
            default:
                this.f38591b.f42882s0.u1(0, true, null, true);
                return;
        }
    }
}
