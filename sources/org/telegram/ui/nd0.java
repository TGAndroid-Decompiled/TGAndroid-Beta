package org.telegram.ui;
public final class nd0 implements org.telegram.ui.ActionBar.a2 {
    public final int f38937a;
    public final ug0 f38938b;

    public nd0(ug0 ug0Var, int i10) {
        this.f38937a = i10;
        this.f38938b = ug0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f38937a) {
            case 0:
                ug0 ug0Var = this.f38938b;
                ug0Var.f41195b[ug0Var.f41193a].d();
                ug0Var.k1(true, true);
                return;
            default:
                ug0 ug0Var2 = this.f38938b;
                ug0Var2.f41209l0 = true;
                if (ug0Var2.f41193a != 0) {
                    ug0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
