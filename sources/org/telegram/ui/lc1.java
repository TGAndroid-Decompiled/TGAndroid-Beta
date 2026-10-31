package org.telegram.ui;
public final class lc1 implements org.telegram.ui.ActionBar.u1 {
    public final int f39173a;
    public final tc1 f39174b;

    public lc1(tc1 tc1Var, int i10) {
        this.f39173a = i10;
        this.f39174b = tc1Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f39173a) {
            case 0:
                this.f39174b.finishFragment();
                return;
            case 1:
                tc1 tc1Var = this.f39174b;
                tc1Var.F0();
                tc1Var.finishFragment();
                return;
            case 2:
                tc1 tc1Var2 = this.f39174b;
                tc1Var2.R = "";
                tc1Var2.I0(false);
                return;
            case 3:
                tc1.e0(this.f39174b);
                return;
            default:
                tc1.b0(this.f39174b);
                return;
        }
    }
}
