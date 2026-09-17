package org.telegram.ui;
public final class hn0 implements org.telegram.ui.ActionBar.b2 {
    public final int f34312a;
    public final mn0 f34313b;

    public hn0(mn0 mn0Var, int i10) {
        this.f34312a = i10;
        this.f34313b = mn0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f34312a) {
            case 0:
                mn0 mn0Var = this.f34313b;
                mn0Var.c(true);
                mn0Var.Q.finishFragment();
                return;
            default:
                mn0 mn0Var2 = this.f34313b;
                mn0Var2.c(true);
                mn0Var2.Q.K1(null, 0, true);
                return;
        }
    }
}
