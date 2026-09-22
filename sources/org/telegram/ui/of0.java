package org.telegram.ui;
public final class of0 implements org.telegram.ui.ActionBar.a2 {
    public final int f36212a;
    public final zf0 f36213b;

    public of0(zf0 zf0Var, int i10) {
        this.f36212a = i10;
        this.f36213b = zf0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36212a) {
            case 0:
                zf0 zf0Var = this.f36213b;
                zf0Var.c(true);
                zf0Var.f40191s0.u1(0, true, null, true);
                return;
            default:
                this.f36213b.f40191s0.u1(0, true, null, true);
                return;
        }
    }
}
