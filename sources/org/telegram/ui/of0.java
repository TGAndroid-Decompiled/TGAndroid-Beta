package org.telegram.ui;
public final class of0 implements org.telegram.ui.ActionBar.a2 {
    public final int f39262a;
    public final zf0 f39263b;

    public of0(zf0 zf0Var, int i10) {
        this.f39262a = i10;
        this.f39263b = zf0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39262a) {
            case 0:
                zf0 zf0Var = this.f39263b;
                zf0Var.c(true);
                zf0Var.f43449s0.u1(0, true, null, true);
                return;
            default:
                this.f39263b.f43449s0.u1(0, true, null, true);
                return;
        }
    }
}
