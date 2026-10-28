package org.telegram.ui;
public final class bn0 implements org.telegram.ui.ActionBar.b2 {
    public final int f38072a;
    public final gn0 f38073b;

    public bn0(gn0 gn0Var, int i10) {
        this.f38072a = i10;
        this.f38073b = gn0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f38072a) {
            case 0:
                gn0 gn0Var = this.f38073b;
                gn0Var.c(true);
                gn0Var.Q.finishFragment();
                return;
            default:
                gn0 gn0Var2 = this.f38073b;
                gn0Var2.c(true);
                gn0Var2.Q.K1(null, 0, true);
                return;
        }
    }
}
