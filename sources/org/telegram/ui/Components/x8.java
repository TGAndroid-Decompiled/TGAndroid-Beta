package org.telegram.ui.Components;
public final class x8 extends org.telegram.ui.ActionBar.j {
    public final int f32769a;
    public final g9 f32770b;

    public x8(g9 g9Var, int i10) {
        this.f32769a = i10;
        this.f32770b = g9Var;
    }

    @Override
    public final void b(int i10) {
        switch (this.f32769a) {
            case 0:
                if (i10 == -1) {
                    g9.U(this.f32770b);
                    return;
                }
                return;
            default:
                g9 g9Var = this.f32770b;
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
