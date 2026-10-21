package org.telegram.ui;
public final class lf1 implements org.telegram.ui.ActionBar.a2 {
    public final int f38913a;
    public final vf1 f38914b;

    public lf1(vf1 vf1Var, int i10) {
        this.f38913a = i10;
        this.f38914b = vf1Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f38913a) {
            case 0:
                this.f38914b.finishFragment();
                return;
            case 1:
                vf1 vf1Var = this.f38914b;
                vf1Var.B0();
                vf1Var.finishFragment();
                return;
            case 2:
                vf1 vf1Var2 = this.f38914b;
                vf1Var2.R = "";
                vf1Var2.E0(false);
                return;
            case 3:
                vf1.a0(this.f38914b);
                return;
            default:
                vf1.X(this.f38914b);
                return;
        }
    }
}
