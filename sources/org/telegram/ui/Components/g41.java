package org.telegram.ui.Components;
public final class g41 implements uu0 {
    public int f26318a;
    public boolean f26319b;
    public final h41 f26320c;

    public g41(h41 h41Var) {
        this.f26320c = h41Var;
    }

    @Override
    public final void L(int i10, boolean z10) {
        if (this.f26318a != i10 || this.f26319b != z10) {
            this.f26318a = i10;
            this.f26319b = z10;
            if (i10 > org.telegram.messenger.i0.L(20.0f)) {
                h41 h41Var = this.f26320c;
                if (!h41Var.f26671g0) {
                    h41Var.f26677n0.f21611q0 = false;
                    h41Var.f26671g0 = true;
                }
            }
        }
    }
}
