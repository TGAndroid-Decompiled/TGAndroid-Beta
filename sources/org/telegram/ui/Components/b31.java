package org.telegram.ui.Components;
public final class b31 implements qt0 {
    public int f31999a;
    public boolean f32000b;
    public final c31 f32001c;

    public b31(c31 c31Var) {
        this.f32001c = c31Var;
    }

    @Override
    public final void K(int i7, boolean z9) {
        if (this.f31999a != i7 || this.f32000b != z9) {
            this.f31999a = i7;
            this.f32000b = z9;
            if (i7 > org.telegram.messenger.g0.L(20.0f)) {
                c31 c31Var = this.f32001c;
                if (!c31Var.f32394g0) {
                    c31Var.f32400n0.f28640q0 = false;
                    c31Var.f32394g0 = true;
                }
            }
        }
    }
}
