package org.telegram.ui;
public final class pd0 implements org.telegram.ui.ActionBar.a2 {
    public final int f36541a;
    public final wg0 f36542b;

    public pd0(wg0 wg0Var, int i10) {
        this.f36541a = i10;
        this.f36542b = wg0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36541a) {
            case 0:
                wg0 wg0Var = this.f36542b;
                wg0Var.f39199b[wg0Var.f39197a].d();
                wg0Var.k1(true, true);
                return;
            default:
                wg0 wg0Var2 = this.f36542b;
                wg0Var2.f39212l0 = true;
                if (wg0Var2.f39197a != 0) {
                    wg0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
