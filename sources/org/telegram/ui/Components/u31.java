package org.telegram.ui.Components;
public final class u31 implements cu0 {
    public int f40221a;
    public boolean f40222b;
    public final v31 f40223c;

    public u31(v31 v31Var) {
        this.f40223c = v31Var;
    }

    @Override
    public final void L(int i7, boolean z10) {
        if (this.f40221a != i7 || this.f40222b != z10) {
            this.f40221a = i7;
            this.f40222b = z10;
            if (i7 > org.telegram.messenger.g0.L(20.0f)) {
                v31 v31Var = this.f40223c;
                if (!v31Var.f40675h0) {
                    v31Var.f40681o0.f30207r0 = false;
                    v31Var.f40675h0 = true;
                }
            }
        }
    }
}
