package org.telegram.ui;
public final class bc0 implements org.telegram.ui.ActionBar.u1 {
    public final int f36027a;
    public final gf0 f36028b;

    public bc0(gf0 gf0Var, int i10) {
        this.f36027a = i10;
        this.f36028b = gf0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f36027a) {
            case 0:
                gf0 gf0Var = this.f36028b;
                gf0Var.f37473b[gf0Var.f37471a].d();
                gf0Var.t1(true, true);
                return;
            default:
                gf0 gf0Var2 = this.f36028b;
                gf0Var2.f37486l0 = true;
                if (gf0Var2.f37471a != 0) {
                    gf0Var2.D1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
