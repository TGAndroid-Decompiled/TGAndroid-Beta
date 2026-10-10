package org.telegram.ui;
public final class od0 implements org.telegram.ui.ActionBar.a2 {
    public final int f40546a;
    public final wg0 f40547b;

    public od0(wg0 wg0Var, int i10) {
        this.f40546a = i10;
        this.f40547b = wg0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f40546a) {
            case 0:
                wg0 wg0Var = this.f40547b;
                wg0Var.f43620b[wg0Var.f43618a].d();
                wg0Var.k1(true, true);
                return;
            default:
                wg0 wg0Var2 = this.f40547b;
                wg0Var2.f43634l0 = true;
                if (wg0Var2.f43618a != 0) {
                    wg0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
