package org.telegram.ui;
public final class mf0 implements org.telegram.ui.ActionBar.z1 {
    public final int f39931a;
    public final yf0 f39932b;

    public mf0(yf0 yf0Var, int i10) {
        this.f39931a = i10;
        this.f39932b = yf0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f39931a) {
            case 0:
                yf0 yf0Var = this.f39932b;
                yf0Var.c(true);
                yf0Var.f44382s0.u1(0, true, null, true);
                return;
            default:
                this.f39932b.f44382s0.u1(0, true, null, true);
                return;
        }
    }
}
