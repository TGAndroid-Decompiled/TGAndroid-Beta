package org.telegram.ui.Components;
public final class u31 implements cu0 {
    public int f40220a;
    public boolean f40221b;
    public final v31 f40222c;

    public u31(v31 v31Var) {
        this.f40222c = v31Var;
    }

    @Override
    public final void L(int i7, boolean z10) {
        if (this.f40220a != i7 || this.f40221b != z10) {
            this.f40220a = i7;
            this.f40221b = z10;
            if (i7 > org.telegram.messenger.g0.L(20.0f)) {
                v31 v31Var = this.f40222c;
                if (!v31Var.f40674h0) {
                    v31Var.f40680o0.f30207r0 = false;
                    v31Var.f40674h0 = true;
                }
            }
        }
    }
}
