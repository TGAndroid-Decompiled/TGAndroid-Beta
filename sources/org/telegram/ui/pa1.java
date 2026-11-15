package org.telegram.ui;
public final class pa1 implements org.telegram.ui.ActionBar.q1 {
    public final int f50228a;
    public final xa1 f50229b;

    public pa1(xa1 xa1Var, int i7) {
        this.f50228a = i7;
        this.f50229b = xa1Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f50228a) {
            case 0:
                this.f50229b.finishFragment();
                return;
            case 1:
                xa1 xa1Var = this.f50229b;
                xa1Var.G0();
                xa1Var.finishFragment();
                return;
            case 2:
                xa1 xa1Var2 = this.f50229b;
                xa1Var2.S = "";
                xa1Var2.J0(false);
                return;
            case 3:
                xa1.f0(this.f50229b);
                return;
            default:
                xa1.c0(this.f50229b);
                return;
        }
    }
}
