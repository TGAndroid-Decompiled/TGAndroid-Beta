package org.telegram.ui.Components;
public final class t8 extends org.telegram.ui.ActionBar.j {
    public final int f28035a;
    public final c9 f28036b;

    public t8(c9 c9Var, int i10) {
        this.f28035a = i10;
        this.f28036b = c9Var;
    }

    @Override
    public final void b(int i10) {
        switch (this.f28035a) {
            case 0:
                if (i10 == -1) {
                    c9.U(this.f28036b);
                    return;
                }
                return;
            default:
                c9 c9Var = this.f28036b;
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
