package org.telegram.ui;
public final class qg1 implements org.telegram.ui.ActionBar.z1 {
    public final int f36913a;
    public final zg1 f36914b;

    public qg1(zg1 zg1Var, int i10) {
        this.f36913a = i10;
        this.f36914b = zg1Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f36913a) {
            case 0:
                this.f36914b.finishFragment();
                return;
            case 1:
                zg1 zg1Var = this.f36914b;
                zg1Var.B0();
                zg1Var.finishFragment();
                return;
            case 2:
                zg1 zg1Var2 = this.f36914b;
                zg1Var2.R = "";
                zg1Var2.E0(false);
                return;
            case 3:
                zg1.a0(this.f36914b);
                return;
            default:
                zg1.X(this.f36914b);
                return;
        }
    }
}
