package org.telegram.ui;
public final class pd0 implements org.telegram.ui.ActionBar.z1 {
    public final int f40922a;
    public final xg0 f40923b;

    public pd0(xg0 xg0Var, int i10) {
        this.f40922a = i10;
        this.f40923b = xg0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f40922a) {
            case 0:
                xg0 xg0Var = this.f40923b;
                xg0Var.f43934b[xg0Var.f43932a].d();
                xg0Var.k1(true, true);
                return;
            default:
                xg0 xg0Var2 = this.f40923b;
                xg0Var2.f43948l0 = true;
                if (xg0Var2.f43932a != 0) {
                    xg0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
