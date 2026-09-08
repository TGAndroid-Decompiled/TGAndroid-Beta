package org.telegram.ui;
public final class pd0 implements org.telegram.ui.ActionBar.a2 {
    public final int f39506a;
    public final wg0 f39507b;

    public pd0(wg0 wg0Var, int i10) {
        this.f39506a = i10;
        this.f39507b = wg0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39506a) {
            case 0:
                wg0 wg0Var = this.f39507b;
                wg0Var.f42388b[wg0Var.f42386a].d();
                wg0Var.k1(true, true);
                return;
            default:
                wg0 wg0Var2 = this.f39507b;
                wg0Var2.f42402l0 = true;
                if (wg0Var2.f42386a != 0) {
                    wg0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
