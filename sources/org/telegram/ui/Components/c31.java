package org.telegram.ui.Components;
public final class c31 implements qt0 {
    public int f32414a;
    public boolean f32415b;
    public final d31 f32416c;

    public c31(d31 d31Var) {
        this.f32416c = d31Var;
    }

    @Override
    public final void K(int i7, boolean z9) {
        if (this.f32414a != i7 || this.f32415b != z9) {
            this.f32414a = i7;
            this.f32415b = z9;
            if (i7 > org.telegram.messenger.g0.L(20.0f)) {
                d31 d31Var = this.f32416c;
                if (!d31Var.f32767g0) {
                    d31Var.f32773n0.f28641q0 = false;
                    d31Var.f32767g0 = true;
                }
            }
        }
    }
}
