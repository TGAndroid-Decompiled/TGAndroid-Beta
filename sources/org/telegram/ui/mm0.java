package org.telegram.ui;
public final class mm0 implements org.telegram.ui.ActionBar.b2 {
    public final int f40607a;
    public final rm0 f40608b;

    public mm0(rm0 rm0Var, int i10) {
        this.f40607a = i10;
        this.f40608b = rm0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f40607a) {
            case 0:
                rm0 rm0Var = this.f40608b;
                rm0Var.c(true);
                rm0Var.M.finishFragment();
                return;
            default:
                rm0 rm0Var2 = this.f40608b;
                rm0Var2.c(true);
                rm0Var2.M.K1(null, 0, true);
                return;
        }
    }
}
