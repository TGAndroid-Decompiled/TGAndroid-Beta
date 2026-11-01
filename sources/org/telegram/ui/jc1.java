package org.telegram.ui;
public final class jc1 implements org.telegram.ui.ActionBar.u1 {
    public final int f38362a;
    public final rc1 f38363b;

    public jc1(rc1 rc1Var, int i10) {
        this.f38362a = i10;
        this.f38363b = rc1Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f38362a) {
            case 0:
                this.f38363b.finishFragment();
                return;
            case 1:
                rc1 rc1Var = this.f38363b;
                rc1Var.G0();
                rc1Var.finishFragment();
                return;
            case 2:
                rc1 rc1Var2 = this.f38363b;
                rc1Var2.R = "";
                rc1Var2.J0(false);
                return;
            case 3:
                rc1.f0(this.f38363b);
                return;
            default:
                rc1.c0(this.f38363b);
                return;
        }
    }
}
