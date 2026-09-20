package org.telegram.ui.Components;
public final class u8 extends org.telegram.ui.ActionBar.j {
    public final int f28612a;
    public final d9 f28613b;

    public u8(d9 d9Var, int i10) {
        this.f28612a = i10;
        this.f28613b = d9Var;
    }

    @Override
    public final void b(int i10) {
        switch (this.f28612a) {
            case 0:
                if (i10 == -1) {
                    d9.U(this.f28613b);
                    return;
                }
                return;
            default:
                d9 d9Var = this.f28613b;
                if (i10 == -1) {
                    d9.U(d9Var);
                }
                if (i10 == 1) {
                    d9Var.f0();
                    return;
                }
                return;
        }
    }
}
