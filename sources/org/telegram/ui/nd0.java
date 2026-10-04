package org.telegram.ui;
public final class nd0 implements org.telegram.ui.ActionBar.a2 {
    public final int f38942a;
    public final ug0 f38943b;

    public nd0(ug0 ug0Var, int i10) {
        this.f38942a = i10;
        this.f38943b = ug0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f38942a) {
            case 0:
                ug0 ug0Var = this.f38943b;
                ug0Var.f41202b[ug0Var.f41200a].d();
                ug0Var.k1(true, true);
                return;
            default:
                ug0 ug0Var2 = this.f38943b;
                ug0Var2.f41216l0 = true;
                if (ug0Var2.f41200a != 0) {
                    ug0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
