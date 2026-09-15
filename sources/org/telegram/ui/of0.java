package org.telegram.ui;
public final class of0 implements org.telegram.ui.ActionBar.a2 {
    public final int f36204a;
    public final zf0 f36205b;

    public of0(zf0 zf0Var, int i10) {
        this.f36204a = i10;
        this.f36205b = zf0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36204a) {
            case 0:
                zf0 zf0Var = this.f36205b;
                zf0Var.c(true);
                zf0Var.f40185s0.u1(0, true, null, true);
                return;
            default:
                this.f36205b.f40185s0.u1(0, true, null, true);
                return;
        }
    }
}
