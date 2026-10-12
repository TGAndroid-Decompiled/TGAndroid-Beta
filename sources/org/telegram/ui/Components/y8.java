package org.telegram.ui.Components;
public final class y8 extends org.telegram.ui.ActionBar.j {
    public final int f31509a;
    public final h9 f31510b;

    public y8(h9 h9Var, int i10) {
        this.f31509a = i10;
        this.f31510b = h9Var;
    }

    @Override
    public final void b(int i10) {
        switch (this.f31509a) {
            case 0:
                if (i10 == -1) {
                    h9.U(this.f31510b);
                    return;
                }
                return;
            default:
                h9 h9Var = this.f31510b;
                if (i10 == -1) {
                    h9.U(h9Var);
                }
                if (i10 == 1) {
                    h9Var.f0();
                    return;
                }
                return;
        }
    }
}
