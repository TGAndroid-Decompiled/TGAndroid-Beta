package org.telegram.ui;
public final class mg1 implements org.telegram.ui.ActionBar.c2 {
    public final int f36081a;
    public final wg1 f36082b;

    public mg1(wg1 wg1Var, int i10) {
        this.f36081a = i10;
        this.f36082b = wg1Var;
    }

    @Override
    public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f36081a) {
            case 0:
                this.f36082b.finishFragment();
                return;
            case 1:
                wg1 wg1Var = this.f36082b;
                wg1Var.B0();
                wg1Var.finishFragment();
                return;
            case 2:
                wg1 wg1Var2 = this.f36082b;
                wg1Var2.O = "";
                wg1Var2.E0(false);
                return;
            case 3:
                wg1.a0(this.f36082b);
                return;
            default:
                wg1.X(this.f36082b);
                return;
        }
    }
}
