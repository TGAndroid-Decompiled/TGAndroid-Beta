package org.telegram.ui;
public final class gf0 implements org.telegram.ui.ActionBar.c2 {
    public final int f34593a;
    public final rf0 f34594b;

    public gf0(rf0 rf0Var, int i10) {
        this.f34593a = i10;
        this.f34594b = rf0Var;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f34593a) {
            case 0:
                rf0 rf0Var = this.f34594b;
                rf0Var.c(true);
                rf0Var.f38034p0.u1(0, true, null, true);
                return;
            default:
                this.f34594b.f38034p0.u1(0, true, null, true);
                return;
        }
    }
}
