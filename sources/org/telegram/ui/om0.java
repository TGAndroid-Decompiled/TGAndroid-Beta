package org.telegram.ui;
public final class om0 implements org.telegram.ui.ActionBar.b2 {
    public final int f41199a;
    public final sm0 f41200b;

    public om0(sm0 sm0Var, int i9) {
        this.f41199a = i9;
        this.f41200b = sm0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f41199a) {
            case 0:
                sm0 sm0Var = this.f41200b;
                sm0Var.c(true);
                sm0Var.M.finishFragment();
                return;
            default:
                sm0 sm0Var2 = this.f41200b;
                sm0Var2.c(true);
                sm0Var2.M.K1(0, true, null);
                return;
        }
    }
}
