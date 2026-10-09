package org.telegram.ui;
public final class od0 implements org.telegram.ui.ActionBar.a2 {
    public final int f40502a;
    public final wg0 f40503b;

    public od0(wg0 wg0Var, int i10) {
        this.f40502a = i10;
        this.f40503b = wg0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f40502a) {
            case 0:
                wg0 wg0Var = this.f40503b;
                wg0Var.f43576b[wg0Var.f43574a].d();
                wg0Var.k1(true, true);
                return;
            default:
                wg0 wg0Var2 = this.f40503b;
                wg0Var2.f43590l0 = true;
                if (wg0Var2.f43574a != 0) {
                    wg0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
