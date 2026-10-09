package org.telegram.ui;
public final class en0 implements org.telegram.ui.ActionBar.a2 {
    public final int f37299a;
    public final jn0 f37300b;

    public en0(jn0 jn0Var, int i10) {
        this.f37299a = i10;
        this.f37300b = jn0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f37299a) {
            case 0:
                jn0 jn0Var = this.f37300b;
                jn0Var.c(true);
                jn0Var.Q.finishFragment();
                return;
            default:
                jn0 jn0Var2 = this.f37300b;
                jn0Var2.c(true);
                jn0Var2.Q.J1(null, 0, true);
                return;
        }
    }
}
