package org.telegram.ui;
public final class eg1 implements org.telegram.ui.ActionBar.c2 {
    public final int f34016a;
    public final og1 f34017b;

    public eg1(og1 og1Var, int i10) {
        this.f34016a = i10;
        this.f34017b = og1Var;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f34016a) {
            case 0:
                this.f34017b.finishFragment();
                return;
            case 1:
                og1 og1Var = this.f34017b;
                og1Var.B0();
                og1Var.finishFragment();
                return;
            case 2:
                og1 og1Var2 = this.f34017b;
                og1Var2.O = "";
                og1Var2.E0(false);
                return;
            case 3:
                og1.a0(this.f34017b);
                return;
            default:
                og1.X(this.f34017b);
                return;
        }
    }
}
