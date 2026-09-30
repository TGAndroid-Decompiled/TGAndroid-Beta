package org.telegram.ui;
public final class qg1 implements org.telegram.ui.ActionBar.z1 {
    public final int f37013a;
    public final zg1 f37014b;

    public qg1(zg1 zg1Var, int i10) {
        this.f37013a = i10;
        this.f37014b = zg1Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f37013a) {
            case 0:
                this.f37014b.finishFragment();
                return;
            case 1:
                zg1 zg1Var = this.f37014b;
                zg1Var.B0();
                zg1Var.finishFragment();
                return;
            case 2:
                zg1 zg1Var2 = this.f37014b;
                zg1Var2.R = "";
                zg1Var2.E0(false);
                return;
            case 3:
                zg1.a0(this.f37014b);
                return;
            default:
                zg1.X(this.f37014b);
                return;
        }
    }
}
