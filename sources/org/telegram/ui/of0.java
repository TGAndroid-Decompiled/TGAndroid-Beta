package org.telegram.ui;
public final class of0 implements org.telegram.ui.ActionBar.a2 {
    public final int f39235a;
    public final zf0 f39236b;

    public of0(zf0 zf0Var, int i10) {
        this.f39235a = i10;
        this.f39236b = zf0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39235a) {
            case 0:
                zf0 zf0Var = this.f39236b;
                zf0Var.c(true);
                zf0Var.f43422s0.u1(0, true, null, true);
                return;
            default:
                this.f39236b.f43422s0.u1(0, true, null, true);
                return;
        }
    }
}
