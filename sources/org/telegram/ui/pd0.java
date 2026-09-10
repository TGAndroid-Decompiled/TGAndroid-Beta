package org.telegram.ui;
public final class pd0 implements org.telegram.ui.ActionBar.c2 {
    public final int f35793a;
    public final xg0 f35794b;

    public pd0(xg0 xg0Var, int i10) {
        this.f35793a = i10;
        this.f35794b = xg0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f35793a) {
            case 0:
                xg0 xg0Var = this.f35794b;
                xg0Var.f38719b[xg0Var.f38717a].d();
                xg0Var.k1(true, true);
                return;
            default:
                xg0 xg0Var2 = this.f35794b;
                xg0Var2.f38732l0 = true;
                if (xg0Var2.f38717a != 0) {
                    xg0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
