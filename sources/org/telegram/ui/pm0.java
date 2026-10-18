package org.telegram.ui;
public final class pm0 implements org.telegram.ui.ActionBar.a2 {
    public final int f40213a;
    public final tm0 f40214b;

    public pm0(tm0 tm0Var, int i10) {
        this.f40213a = i10;
        this.f40214b = tm0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f40213a) {
            case 0:
                tm0 tm0Var = this.f40214b;
                tm0Var.c(true);
                tm0Var.Q.finishFragment();
                return;
            default:
                tm0 tm0Var2 = this.f40214b;
                tm0Var2.c(true);
                tm0Var2.Q.J1(null, 0, true);
                return;
        }
    }
}
