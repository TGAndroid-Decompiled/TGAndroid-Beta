package org.telegram.ui.Components;
public final class f41 implements tu0 {
    public int f25959a;
    public boolean f25960b;
    public final g41 f25961c;

    public f41(g41 g41Var) {
        this.f25961c = g41Var;
    }

    @Override
    public final void K(int i10, boolean z10) {
        if (this.f25959a != i10 || this.f25960b != z10) {
            this.f25959a = i10;
            this.f25960b = z10;
            if (i10 > org.telegram.messenger.i0.L(20.0f)) {
                g41 g41Var = this.f25961c;
                if (!g41Var.f26251g0) {
                    g41Var.f26257n0.f21610q0 = false;
                    g41Var.f26251g0 = true;
                }
            }
        }
    }
}
