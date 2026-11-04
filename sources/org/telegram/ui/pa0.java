package org.telegram.ui;
public final class pa0 implements org.telegram.ui.ActionBar.p1 {
    public final int f48501a;
    public final xd0 f48502b;

    public pa0(xd0 xd0Var, int i3) {
        this.f48501a = i3;
        this.f48502b = xd0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f48501a) {
            case 0:
                xd0 xd0Var = this.f48502b;
                xd0Var.f51948b[xd0Var.f51946a].d();
                xd0Var.t1(true, true);
                return;
            default:
                xd0 xd0Var2 = this.f48502b;
                xd0Var2.m0 = true;
                if (xd0Var2.f51946a != 0) {
                    xd0Var2.D1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
