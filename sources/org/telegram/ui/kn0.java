package org.telegram.ui;
public final class kn0 implements org.telegram.ui.ActionBar.z1 {
    public final int f37696a;
    public final qn0 f37697b;

    public kn0(qn0 qn0Var, int i10) {
        this.f37696a = i10;
        this.f37697b = qn0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f37696a) {
            case 0:
                qn0 qn0Var = this.f37697b;
                qn0Var.c(true);
                qn0Var.Q.finishFragment();
                return;
            default:
                qn0 qn0Var2 = this.f37697b;
                qn0Var2.c(true);
                qn0Var2.Q.J1(null, 0, true);
                return;
        }
    }
}
