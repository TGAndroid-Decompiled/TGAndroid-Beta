package org.telegram.ui.Components;
public final class u8 extends org.telegram.ui.ActionBar.k {
    public final int f27604a;
    public final d9 f27605b;

    public u8(d9 d9Var, int i10) {
        this.f27604a = i10;
        this.f27605b = d9Var;
    }

    @Override
    public final void b(int i10) {
        switch (this.f27604a) {
            case 0:
                if (i10 == -1) {
                    d9.U(this.f27605b);
                    return;
                }
                return;
            default:
                d9 d9Var = this.f27605b;
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
