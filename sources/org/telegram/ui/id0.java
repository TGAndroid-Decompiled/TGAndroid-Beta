package org.telegram.ui;
public final class id0 implements org.telegram.ui.ActionBar.c2 {
    public final int f37801a;
    public final og0 f37802b;

    public id0(og0 og0Var, int i10) {
        this.f37801a = i10;
        this.f37802b = og0Var;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f37801a) {
            case 0:
                og0 og0Var = this.f37802b;
                og0Var.f39752b[og0Var.f39750a].d();
                og0Var.k1(true, true);
                return;
            default:
                og0 og0Var2 = this.f37802b;
                og0Var2.f39763i0 = true;
                if (og0Var2.f39750a != 0) {
                    og0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
