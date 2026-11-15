package org.telegram.ui;
public final class pa1 implements org.telegram.ui.ActionBar.q1 {
    public final int f50205a;
    public final xa1 f50206b;

    public pa1(xa1 xa1Var, int i7) {
        this.f50205a = i7;
        this.f50206b = xa1Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f50205a) {
            case 0:
                this.f50206b.finishFragment();
                return;
            case 1:
                xa1 xa1Var = this.f50206b;
                xa1Var.G0();
                xa1Var.finishFragment();
                return;
            case 2:
                xa1 xa1Var2 = this.f50206b;
                xa1Var2.S = "";
                xa1Var2.J0(false);
                return;
            case 3:
                xa1.f0(this.f50206b);
                return;
            default:
                xa1.c0(this.f50206b);
                return;
        }
    }
}
