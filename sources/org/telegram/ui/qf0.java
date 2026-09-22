package org.telegram.ui;
public final class qf0 implements org.telegram.ui.ActionBar.a2 {
    public final int f36924a;
    public final bg0 f36925b;

    public qf0(bg0 bg0Var, int i10) {
        this.f36924a = i10;
        this.f36925b = bg0Var;
    }

    @Override
    public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36924a) {
            case 0:
                bg0 bg0Var = this.f36925b;
                bg0Var.c(true);
                bg0Var.f32454s0.u1(0, true, null, true);
                return;
            default:
                this.f36925b.f32454s0.u1(0, true, null, true);
                return;
        }
    }
}
