package org.telegram.ui.Components;
public final class x8 extends org.telegram.ui.ActionBar.j {
    public final int f32674a;
    public final g9 f32675b;

    public x8(g9 g9Var, int i10) {
        this.f32674a = i10;
        this.f32675b = g9Var;
    }

    @Override
    public final void b(int i10) {
        switch (this.f32674a) {
            case 0:
                if (i10 == -1) {
                    g9.U(this.f32675b);
                    return;
                }
                return;
            default:
                g9 g9Var = this.f32675b;
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
