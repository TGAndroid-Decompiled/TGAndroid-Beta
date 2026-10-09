package org.telegram.ui;
public final class od0 implements org.telegram.ui.ActionBar.a2 {
    public final int f40500a;
    public final wg0 f40501b;

    public od0(wg0 wg0Var, int i10) {
        this.f40500a = i10;
        this.f40501b = wg0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f40500a) {
            case 0:
                wg0 wg0Var = this.f40501b;
                wg0Var.f43574b[wg0Var.f43572a].d();
                wg0Var.k1(true, true);
                return;
            default:
                wg0 wg0Var2 = this.f40501b;
                wg0Var2.f43588l0 = true;
                if (wg0Var2.f43572a != 0) {
                    wg0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
