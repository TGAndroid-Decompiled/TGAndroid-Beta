package org.telegram.ui;
public final class jd0 implements org.telegram.ui.ActionBar.c2 {
    public final int f35177a;
    public final pg0 f35178b;

    public jd0(pg0 pg0Var, int i10) {
        this.f35177a = i10;
        this.f35178b = pg0Var;
    }

    @Override
    public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f35177a) {
            case 0:
                pg0 pg0Var = this.f35178b;
                pg0Var.f37128b[pg0Var.f37126a].d();
                pg0Var.k1(true, true);
                return;
            default:
                pg0 pg0Var2 = this.f35178b;
                pg0Var2.f37138i0 = true;
                if (pg0Var2.f37126a != 0) {
                    pg0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
