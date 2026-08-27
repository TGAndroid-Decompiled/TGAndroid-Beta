package org.telegram.ui;

public final class qf1 implements org.telegram.ui.ActionBar.a2 {

    public final int f41652a;

    public final zf1 f41653b;

    public qf1(zf1 zf1Var, int i10) {
        this.f41652a = i10;
        this.f41653b = zf1Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f41652a) {
            case 0:
                this.f41653b.finishFragment();
                break;
            case 1:
                zf1 zf1Var = this.f41653b;
                zf1Var.B0();
                zf1Var.finishFragment();
                break;
            case 2:
                zf1 zf1Var2 = this.f41653b;
                zf1Var2.N = "";
                zf1Var2.E0(false);
                break;
            case 3:
                zf1.a0(this.f41653b);
                break;
            default:
                zf1.X(this.f41653b);
                break;
        }
    }
}
