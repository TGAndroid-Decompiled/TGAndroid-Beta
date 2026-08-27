package org.telegram.ui;

public final class pm0 implements org.telegram.ui.ActionBar.a2 {

    public final int f41389a;

    public final tm0 f41390b;

    public pm0(tm0 tm0Var, int i10) {
        this.f41389a = i10;
        this.f41390b = tm0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f41389a) {
            case 0:
                tm0 tm0Var = this.f41390b;
                tm0Var.c(true);
                tm0Var.M.finishFragment();
                break;
            default:
                tm0 tm0Var2 = this.f41390b;
                tm0Var2.c(true);
                tm0Var2.M.K1(0, true, null);
                break;
        }
    }
}
