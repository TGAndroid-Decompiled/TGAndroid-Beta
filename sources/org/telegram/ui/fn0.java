package org.telegram.ui;
public final class fn0 implements org.telegram.ui.ActionBar.a2 {
    public final int f33635a;
    public final kn0 f33636b;

    public fn0(kn0 kn0Var, int i10) {
        this.f33635a = i10;
        this.f33636b = kn0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f33635a) {
            case 0:
                kn0 kn0Var = this.f33636b;
                kn0Var.c(true);
                kn0Var.Q.finishFragment();
                return;
            default:
                kn0 kn0Var2 = this.f33636b;
                kn0Var2.c(true);
                kn0Var2.Q.K1(null, 0, true);
                return;
        }
    }
}
