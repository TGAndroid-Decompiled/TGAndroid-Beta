package org.telegram.ui;
public final class dh1 implements org.telegram.ui.ActionBar.c2 {
    public final int f31913a;
    public final mh1 f31914b;

    public dh1(mh1 mh1Var, int i10) {
        this.f31913a = i10;
        this.f31914b = mh1Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f31913a) {
            case 0:
                this.f31914b.finishFragment();
                return;
            case 1:
                mh1 mh1Var = this.f31914b;
                mh1Var.B0();
                mh1Var.finishFragment();
                return;
            case 2:
                mh1 mh1Var2 = this.f31914b;
                mh1Var2.R = "";
                mh1Var2.E0(false);
                return;
            case 3:
                mh1.a0(this.f31914b);
                return;
            default:
                mh1.X(this.f31914b);
                return;
        }
    }
}
