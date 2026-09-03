package org.telegram.ui;
public final class id0 implements org.telegram.ui.ActionBar.c2 {
    public final int f37636a;
    public final og0 f37637b;

    public id0(og0 og0Var, int i10) {
        this.f37636a = i10;
        this.f37637b = og0Var;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f37636a) {
            case 0:
                og0 og0Var = this.f37637b;
                og0Var.f39712b[og0Var.f39710a].d();
                og0Var.k1(true, true);
                return;
            default:
                og0 og0Var2 = this.f37637b;
                og0Var2.f39723i0 = true;
                if (og0Var2.f39710a != 0) {
                    og0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
