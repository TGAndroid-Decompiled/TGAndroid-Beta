package org.telegram.ui;
public final class pd0 implements org.telegram.ui.ActionBar.a2 {
    public final int f39480a;
    public final wg0 f39481b;

    public pd0(wg0 wg0Var, int i10) {
        this.f39480a = i10;
        this.f39481b = wg0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39480a) {
            case 0:
                wg0 wg0Var = this.f39481b;
                wg0Var.f42362b[wg0Var.f42360a].d();
                wg0Var.k1(true, true);
                return;
            default:
                wg0 wg0Var2 = this.f39481b;
                wg0Var2.f42376l0 = true;
                if (wg0Var2.f42360a != 0) {
                    wg0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
