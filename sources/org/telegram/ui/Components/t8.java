package org.telegram.ui.Components;
public final class t8 extends org.telegram.ui.ActionBar.j {
    public final int f28032a;
    public final c9 f28033b;

    public t8(c9 c9Var, int i10) {
        this.f28032a = i10;
        this.f28033b = c9Var;
    }

    @Override
    public final void b(int i10) {
        switch (this.f28032a) {
            case 0:
                if (i10 == -1) {
                    c9.U(this.f28033b);
                    return;
                }
                return;
            default:
                c9 c9Var = this.f28033b;
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
