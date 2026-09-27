package org.telegram.ui;
public final class an0 implements org.telegram.ui.ActionBar.b2 {
    public final int f32108a;
    public final fn0 f32109b;

    public an0(fn0 fn0Var, int i10) {
        this.f32108a = i10;
        this.f32109b = fn0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f32108a) {
            case 0:
                fn0 fn0Var = this.f32109b;
                fn0Var.c(true);
                fn0Var.Q.finishFragment();
                return;
            default:
                fn0 fn0Var2 = this.f32109b;
                fn0Var2.c(true);
                fn0Var2.Q.K1(null, 0, true);
                return;
        }
    }
}
