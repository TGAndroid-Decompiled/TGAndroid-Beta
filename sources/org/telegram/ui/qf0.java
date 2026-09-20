package org.telegram.ui;
public final class qf0 implements org.telegram.ui.ActionBar.a2 {
    public final int f36901a;
    public final bg0 f36902b;

    public qf0(bg0 bg0Var, int i10) {
        this.f36901a = i10;
        this.f36902b = bg0Var;
    }

    @Override
    public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36901a) {
            case 0:
                bg0 bg0Var = this.f36902b;
                bg0Var.c(true);
                bg0Var.f32436s0.u1(0, true, null, true);
                return;
            default:
                this.f36902b.f32436s0.u1(0, true, null, true);
                return;
        }
    }
}
