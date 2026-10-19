package org.telegram.ui;
public final class lf1 implements org.telegram.ui.ActionBar.a2 {
    public final int f38906a;
    public final vf1 f38907b;

    public lf1(vf1 vf1Var, int i10) {
        this.f38906a = i10;
        this.f38907b = vf1Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f38906a) {
            case 0:
                this.f38907b.finishFragment();
                return;
            case 1:
                vf1 vf1Var = this.f38907b;
                vf1Var.B0();
                vf1Var.finishFragment();
                return;
            case 2:
                vf1 vf1Var2 = this.f38907b;
                vf1Var2.R = "";
                vf1Var2.E0(false);
                return;
            case 3:
                vf1.a0(this.f38907b);
                return;
            default:
                vf1.X(this.f38907b);
                return;
        }
    }
}
