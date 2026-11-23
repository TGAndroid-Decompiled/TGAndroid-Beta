package org.telegram.ui.Components;
public final class u31 implements cu0 {
    public int f40203a;
    public boolean f40204b;
    public final v31 f40205c;

    public u31(v31 v31Var) {
        this.f40205c = v31Var;
    }

    @Override
    public final void L(int i7, boolean z10) {
        if (this.f40203a != i7 || this.f40204b != z10) {
            this.f40203a = i7;
            this.f40204b = z10;
            if (i7 > org.telegram.messenger.g0.L(20.0f)) {
                v31 v31Var = this.f40205c;
                if (!v31Var.f40626h0) {
                    v31Var.f40632o0.f30173r0 = false;
                    v31Var.f40626h0 = true;
                }
            }
        }
    }
}
