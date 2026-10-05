package org.telegram.ui;
public final class qg1 implements org.telegram.ui.ActionBar.a2 {
    public final int f39792a;
    public final zg1 f39793b;

    public qg1(zg1 zg1Var, int i10) {
        this.f39792a = i10;
        this.f39793b = zg1Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39792a) {
            case 0:
                this.f39793b.finishFragment();
                return;
            case 1:
                zg1 zg1Var = this.f39793b;
                zg1Var.B0();
                zg1Var.finishFragment();
                return;
            case 2:
                zg1 zg1Var2 = this.f39793b;
                zg1Var2.R = "";
                zg1Var2.E0(false);
                return;
            case 3:
                zg1.Z(this.f39793b);
                return;
            default:
                zg1.W(this.f39793b);
                return;
        }
    }
}
