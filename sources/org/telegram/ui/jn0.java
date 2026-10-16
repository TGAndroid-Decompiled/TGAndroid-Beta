package org.telegram.ui;
public final class jn0 implements org.telegram.ui.ActionBar.z1 {
    public final int f37103a;
    public final on0 f37104b;

    public jn0(on0 on0Var, int i10) {
        this.f37103a = i10;
        this.f37104b = on0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f37103a) {
            case 0:
                on0 on0Var = this.f37104b;
                on0Var.c(true);
                on0Var.Q.finishFragment();
                return;
            default:
                on0 on0Var2 = this.f37104b;
                on0Var2.c(true);
                on0Var2.Q.J1(null, 0, true);
                return;
        }
    }
}
