package org.telegram.ui;
public final class qf0 implements org.telegram.ui.ActionBar.b2 {
    public final int f36916a;
    public final bg0 f36917b;

    public qf0(bg0 bg0Var, int i10) {
        this.f36916a = i10;
        this.f36917b = bg0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f36916a) {
            case 0:
                bg0 bg0Var = this.f36917b;
                bg0Var.c(true);
                bg0Var.f32157s0.u1(0, true, null, true);
                return;
            default:
                this.f36917b.f32157s0.u1(0, true, null, true);
                return;
        }
    }
}
