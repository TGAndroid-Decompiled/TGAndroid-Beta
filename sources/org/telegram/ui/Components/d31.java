package org.telegram.ui.Components;
public final class d31 implements st0 {
    public int f32858a;
    public boolean f32859b;
    public final e31 f32860c;

    public d31(e31 e31Var) {
        this.f32860c = e31Var;
    }

    @Override
    public final void K(int i7, boolean z9) {
        if (this.f32858a != i7 || this.f32859b != z9) {
            this.f32858a = i7;
            this.f32859b = z9;
            if (i7 > org.telegram.messenger.g0.L(20.0f)) {
                e31 e31Var = this.f32860c;
                if (!e31Var.f33278g0) {
                    e31Var.f33284n0.f28649q0 = false;
                    e31Var.f33278g0 = true;
                }
            }
        }
    }
}
