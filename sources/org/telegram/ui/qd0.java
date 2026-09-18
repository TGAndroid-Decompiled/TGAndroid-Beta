package org.telegram.ui;
public final class qd0 implements org.telegram.ui.ActionBar.a2 {
    public final int f36795a;
    public final xg0 f36796b;

    public qd0(xg0 xg0Var, int i10) {
        this.f36795a = i10;
        this.f36796b = xg0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36795a) {
            case 0:
                xg0 xg0Var = this.f36796b;
                xg0Var.f39463b[xg0Var.f39461a].d();
                xg0Var.k1(true, true);
                return;
            default:
                xg0 xg0Var2 = this.f36796b;
                xg0Var2.f39476l0 = true;
                if (xg0Var2.f39461a != 0) {
                    xg0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
