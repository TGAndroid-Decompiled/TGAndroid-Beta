package org.telegram.ui;
public final class nf1 implements org.telegram.ui.ActionBar.a2 {
    public final int f39431a;
    public final xf1 f39432b;

    public nf1(xf1 xf1Var, int i10) {
        this.f39431a = i10;
        this.f39432b = xf1Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39431a) {
            case 0:
                this.f39432b.finishFragment();
                return;
            case 1:
                xf1 xf1Var = this.f39432b;
                xf1Var.B0();
                xf1Var.finishFragment();
                return;
            case 2:
                xf1 xf1Var2 = this.f39432b;
                xf1Var2.R = "";
                xf1Var2.E0(false);
                return;
            case 3:
                xf1.a0(this.f39432b);
                return;
            default:
                xf1.X(this.f39432b);
                return;
        }
    }
}
