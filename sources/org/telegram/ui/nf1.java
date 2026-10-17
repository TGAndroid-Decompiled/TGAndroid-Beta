package org.telegram.ui;
public final class nf1 implements org.telegram.ui.ActionBar.a2 {
    public final int f39441a;
    public final xf1 f39442b;

    public nf1(xf1 xf1Var, int i10) {
        this.f39441a = i10;
        this.f39442b = xf1Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39441a) {
            case 0:
                this.f39442b.finishFragment();
                return;
            case 1:
                xf1 xf1Var = this.f39442b;
                xf1Var.B0();
                xf1Var.finishFragment();
                return;
            case 2:
                xf1 xf1Var2 = this.f39442b;
                xf1Var2.R = "";
                xf1Var2.E0(false);
                return;
            case 3:
                xf1.a0(this.f39442b);
                return;
            default:
                xf1.X(this.f39442b);
                return;
        }
    }
}
