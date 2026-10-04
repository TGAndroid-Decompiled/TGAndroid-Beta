package org.telegram.ui;
public final class nd0 implements org.telegram.ui.ActionBar.a2 {
    public final int f38936a;
    public final ug0 f38937b;

    public nd0(ug0 ug0Var, int i10) {
        this.f38936a = i10;
        this.f38937b = ug0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f38936a) {
            case 0:
                ug0 ug0Var = this.f38937b;
                ug0Var.f41194b[ug0Var.f41192a].d();
                ug0Var.k1(true, true);
                return;
            default:
                ug0 ug0Var2 = this.f38937b;
                ug0Var2.f41208l0 = true;
                if (ug0Var2.f41192a != 0) {
                    ug0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
