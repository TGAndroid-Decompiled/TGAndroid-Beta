package org.telegram.ui;
public final class nm0 implements org.telegram.ui.ActionBar.a2 {
    public final int f39659a;
    public final rm0 f39660b;

    public nm0(rm0 rm0Var, int i10) {
        this.f39659a = i10;
        this.f39660b = rm0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39659a) {
            case 0:
                rm0 rm0Var = this.f39660b;
                rm0Var.c(true);
                rm0Var.Q.finishFragment();
                return;
            default:
                rm0 rm0Var2 = this.f39660b;
                rm0Var2.c(true);
                rm0Var2.Q.J1(null, 0, true);
                return;
        }
    }
}
