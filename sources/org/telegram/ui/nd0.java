package org.telegram.ui;
public final class nd0 implements org.telegram.ui.ActionBar.a2 {
    public final int f38932a;
    public final ug0 f38933b;

    public nd0(ug0 ug0Var, int i10) {
        this.f38932a = i10;
        this.f38933b = ug0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f38932a) {
            case 0:
                ug0 ug0Var = this.f38933b;
                ug0Var.f41238b[ug0Var.f41236a].d();
                ug0Var.k1(true, true);
                return;
            default:
                ug0 ug0Var2 = this.f38933b;
                ug0Var2.f41252l0 = true;
                if (ug0Var2.f41236a != 0) {
                    ug0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
