package org.telegram.ui;
public final class pd0 implements org.telegram.ui.ActionBar.a2 {
    public final int f36546a;
    public final wg0 f36547b;

    public pd0(wg0 wg0Var, int i10) {
        this.f36546a = i10;
        this.f36547b = wg0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36546a) {
            case 0:
                wg0 wg0Var = this.f36547b;
                wg0Var.f39195b[wg0Var.f39193a].d();
                wg0Var.k1(true, true);
                return;
            default:
                wg0 wg0Var2 = this.f36547b;
                wg0Var2.f39208l0 = true;
                if (wg0Var2.f39193a != 0) {
                    wg0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
