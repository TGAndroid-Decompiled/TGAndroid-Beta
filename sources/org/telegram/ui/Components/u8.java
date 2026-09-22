package org.telegram.ui.Components;
public final class u8 extends org.telegram.ui.ActionBar.j {
    public final int f28693a;
    public final d9 f28694b;

    public u8(d9 d9Var, int i10) {
        this.f28693a = i10;
        this.f28694b = d9Var;
    }

    @Override
    public final void b(int i10) {
        switch (this.f28693a) {
            case 0:
                if (i10 == -1) {
                    d9.U(this.f28694b);
                    return;
                }
                return;
            default:
                d9 d9Var = this.f28694b;
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
