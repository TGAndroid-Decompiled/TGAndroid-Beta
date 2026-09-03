package org.telegram.ui;
public final class mg1 implements org.telegram.ui.ActionBar.c2 {
    public final int f38975a;
    public final vg1 f38976b;

    public mg1(vg1 vg1Var, int i10) {
        this.f38975a = i10;
        this.f38976b = vg1Var;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f38975a) {
            case 0:
                this.f38976b.finishFragment();
                return;
            case 1:
                vg1 vg1Var = this.f38976b;
                vg1Var.B0();
                vg1Var.finishFragment();
                return;
            case 2:
                vg1 vg1Var2 = this.f38976b;
                vg1Var2.O = "";
                vg1Var2.E0(false);
                return;
            case 3:
                vg1.a0(this.f38976b);
                return;
            default:
                vg1.X(this.f38976b);
                return;
        }
    }
}
