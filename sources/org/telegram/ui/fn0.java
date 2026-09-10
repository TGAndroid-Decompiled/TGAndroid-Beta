package org.telegram.ui;
public final class fn0 implements org.telegram.ui.ActionBar.c2 {
    public final int f32871a;
    public final kn0 f32872b;

    public fn0(kn0 kn0Var, int i10) {
        this.f32871a = i10;
        this.f32872b = kn0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f32871a) {
            case 0:
                kn0 kn0Var = this.f32872b;
                kn0Var.c(true);
                kn0Var.Q.finishFragment();
                return;
            default:
                kn0 kn0Var2 = this.f32872b;
                kn0Var2.c(true);
                kn0Var2.Q.K1(null, 0, true);
                return;
        }
    }
}
