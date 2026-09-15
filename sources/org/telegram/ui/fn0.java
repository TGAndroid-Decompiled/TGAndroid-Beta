package org.telegram.ui;
public final class fn0 implements org.telegram.ui.ActionBar.a2 {
    public final int f33621a;
    public final kn0 f33622b;

    public fn0(kn0 kn0Var, int i10) {
        this.f33621a = i10;
        this.f33622b = kn0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f33621a) {
            case 0:
                kn0 kn0Var = this.f33622b;
                kn0Var.c(true);
                kn0Var.Q.finishFragment();
                return;
            default:
                kn0 kn0Var2 = this.f33622b;
                kn0Var2.c(true);
                kn0Var2.Q.K1(null, 0, true);
                return;
        }
    }
}
