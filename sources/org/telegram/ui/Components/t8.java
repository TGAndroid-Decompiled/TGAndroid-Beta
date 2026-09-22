package org.telegram.ui.Components;
public final class t8 extends org.telegram.ui.ActionBar.j {
    public final int f28064a;
    public final c9 f28065b;

    public t8(c9 c9Var, int i10) {
        this.f28064a = i10;
        this.f28065b = c9Var;
    }

    @Override
    public final void b(int i10) {
        switch (this.f28064a) {
            case 0:
                if (i10 == -1) {
                    c9.U(this.f28065b);
                    return;
                }
                return;
            default:
                c9 c9Var = this.f28065b;
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
