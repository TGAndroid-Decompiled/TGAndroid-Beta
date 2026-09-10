package org.telegram.ui;
public final class of0 implements org.telegram.ui.ActionBar.c2 {
    public final int f35483a;
    public final zf0 f35484b;

    public of0(zf0 zf0Var, int i10) {
        this.f35483a = i10;
        this.f35484b = zf0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f35483a) {
            case 0:
                zf0 zf0Var = this.f35484b;
                zf0Var.c(true);
                zf0Var.f39305s0.u1(0, true, null, true);
                return;
            default:
                this.f35484b.f39305s0.u1(0, true, null, true);
                return;
        }
    }
}
