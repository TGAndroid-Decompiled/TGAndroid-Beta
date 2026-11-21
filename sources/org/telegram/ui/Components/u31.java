package org.telegram.ui.Components;
public final class u31 implements cu0 {
    public int f40228a;
    public boolean f40229b;
    public final v31 f40230c;

    public u31(v31 v31Var) {
        this.f40230c = v31Var;
    }

    @Override
    public final void L(int i7, boolean z10) {
        if (this.f40228a != i7 || this.f40229b != z10) {
            this.f40228a = i7;
            this.f40229b = z10;
            if (i7 > org.telegram.messenger.g0.L(20.0f)) {
                v31 v31Var = this.f40230c;
                if (!v31Var.f40673h0) {
                    v31Var.f40679o0.f30204r0 = false;
                    v31Var.f40673h0 = true;
                }
            }
        }
    }
}
