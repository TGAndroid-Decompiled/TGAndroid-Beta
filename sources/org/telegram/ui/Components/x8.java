package org.telegram.ui.Components;
public final class x8 extends org.telegram.ui.ActionBar.j {
    public final int f32855a;
    public final g9 f32856b;

    public x8(g9 g9Var, int i10) {
        this.f32855a = i10;
        this.f32856b = g9Var;
    }

    @Override
    public final void b(int i10) {
        switch (this.f32855a) {
            case 0:
                if (i10 == -1) {
                    g9.U(this.f32856b);
                    return;
                }
                return;
            default:
                g9 g9Var = this.f32856b;
                if (i10 == -1) {
                    g9.U(g9Var);
                }
                if (i10 == 1) {
                    g9Var.f0();
                    return;
                }
                return;
        }
    }
}
