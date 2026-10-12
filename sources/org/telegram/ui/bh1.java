package org.telegram.ui;
public final class bh1 implements org.telegram.ui.ActionBar.z1 {
    public final int f36175a;
    public final kh1 f36176b;

    public bh1(kh1 kh1Var, int i10) {
        this.f36175a = i10;
        this.f36176b = kh1Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f36175a) {
            case 0:
                this.f36176b.finishFragment();
                return;
            case 1:
                kh1 kh1Var = this.f36176b;
                kh1Var.B0();
                kh1Var.finishFragment();
                return;
            case 2:
                kh1 kh1Var2 = this.f36176b;
                kh1Var2.R = "";
                kh1Var2.E0(false);
                return;
            case 3:
                kh1.a0(this.f36176b);
                return;
            default:
                kh1.X(this.f36176b);
                return;
        }
    }
}
