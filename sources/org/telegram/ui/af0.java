package org.telegram.ui;
public final class af0 implements org.telegram.ui.ActionBar.b2 {
    public final int f37763a;
    public final lf0 f37764b;

    public af0(lf0 lf0Var, int i10) {
        this.f37763a = i10;
        this.f37764b = lf0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f37763a) {
            case 0:
                lf0 lf0Var = this.f37764b;
                lf0Var.c(true);
                lf0Var.f41134u0.z1(0, true, null, true);
                return;
            default:
                this.f37764b.f41134u0.z1(0, true, null, true);
                return;
        }
    }
}
