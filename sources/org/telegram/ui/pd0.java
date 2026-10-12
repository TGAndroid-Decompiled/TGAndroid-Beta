package org.telegram.ui;
public final class pd0 implements org.telegram.ui.ActionBar.z1 {
    public final int f40924a;
    public final xg0 f40925b;

    public pd0(xg0 xg0Var, int i10) {
        this.f40924a = i10;
        this.f40925b = xg0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f40924a) {
            case 0:
                xg0 xg0Var = this.f40925b;
                xg0Var.f43939b[xg0Var.f43937a].d();
                xg0Var.k1(true, true);
                return;
            default:
                xg0 xg0Var2 = this.f40925b;
                xg0Var2.f43953l0 = true;
                if (xg0Var2.f43937a != 0) {
                    xg0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
