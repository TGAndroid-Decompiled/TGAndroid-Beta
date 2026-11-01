package org.telegram.ui;
public final class al0 implements org.telegram.ui.ActionBar.u1 {
    public final int f35803a;
    public final fl0 f35804b;

    public al0(fl0 fl0Var, int i10) {
        this.f35803a = i10;
        this.f35804b = fl0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f35803a) {
            case 0:
                fl0 fl0Var = this.f35804b;
                fl0Var.c(true);
                fl0Var.Q.finishFragment();
                return;
            default:
                fl0 fl0Var2 = this.f35804b;
                fl0Var2.c(true);
                fl0Var2.Q.O1(null, 0, true);
                return;
        }
    }
}
