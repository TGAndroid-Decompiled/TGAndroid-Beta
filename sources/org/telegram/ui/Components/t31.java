package org.telegram.ui.Components;
public final class t31 implements bu0 {
    public int f39790a;
    public boolean f39791b;
    public final u31 f39792c;

    public t31(u31 u31Var) {
        this.f39792c = u31Var;
    }

    @Override
    public final void L(int i7, boolean z10) {
        if (this.f39790a != i7 || this.f39791b != z10) {
            this.f39790a = i7;
            this.f39791b = z10;
            if (i7 > org.telegram.messenger.g0.L(20.0f)) {
                u31 u31Var = this.f39792c;
                if (!u31Var.f40262h0) {
                    u31Var.f40268o0.f30257r0 = false;
                    u31Var.f40262h0 = true;
                }
            }
        }
    }
}
