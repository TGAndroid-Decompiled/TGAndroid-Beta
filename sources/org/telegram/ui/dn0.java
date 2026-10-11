package org.telegram.ui;
public final class dn0 implements org.telegram.ui.ActionBar.z1 {
    public final int f37091a;
    public final in0 f37092b;

    public dn0(in0 in0Var, int i10) {
        this.f37091a = i10;
        this.f37092b = in0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f37091a) {
            case 0:
                in0 in0Var = this.f37092b;
                in0Var.c(true);
                in0Var.Q.finishFragment();
                return;
            default:
                in0 in0Var2 = this.f37092b;
                in0Var2.c(true);
                in0Var2.Q.J1(null, 0, true);
                return;
        }
    }
}
