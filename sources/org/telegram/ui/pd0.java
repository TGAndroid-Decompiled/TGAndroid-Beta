package org.telegram.ui;
public final class pd0 implements org.telegram.ui.ActionBar.a2 {
    public final int f39507a;
    public final wg0 f39508b;

    public pd0(wg0 wg0Var, int i10) {
        this.f39507a = i10;
        this.f39508b = wg0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39507a) {
            case 0:
                wg0 wg0Var = this.f39508b;
                wg0Var.f42389b[wg0Var.f42387a].d();
                wg0Var.k1(true, true);
                return;
            default:
                wg0 wg0Var2 = this.f39508b;
                wg0Var2.f42403l0 = true;
                if (wg0Var2.f42387a != 0) {
                    wg0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
