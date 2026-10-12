package org.telegram.ui;
public final class gn0 implements org.telegram.ui.ActionBar.z1 {
    public final int f38107a;
    public final ln0 f38108b;

    public gn0(ln0 ln0Var, int i10) {
        this.f38107a = i10;
        this.f38108b = ln0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f38107a) {
            case 0:
                ln0 ln0Var = this.f38108b;
                ln0Var.c(true);
                ln0Var.Q.finishFragment();
                return;
            default:
                ln0 ln0Var2 = this.f38108b;
                ln0Var2.c(true);
                ln0Var2.Q.J1(null, 0, true);
                return;
        }
    }
}
