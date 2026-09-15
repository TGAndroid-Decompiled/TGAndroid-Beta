package org.telegram.ui.Components;
public final class t8 extends org.telegram.ui.ActionBar.j {
    public final int f28067a;
    public final c9 f28068b;

    public t8(c9 c9Var, int i10) {
        this.f28067a = i10;
        this.f28068b = c9Var;
    }

    @Override
    public final void b(int i10) {
        switch (this.f28067a) {
            case 0:
                if (i10 == -1) {
                    c9.U(this.f28068b);
                    return;
                }
                return;
            default:
                c9 c9Var = this.f28068b;
                if (i10 == -1) {
                    c9.U(c9Var);
                }
                if (i10 == 1) {
                    c9Var.f0();
                    return;
                }
                return;
        }
    }
}
