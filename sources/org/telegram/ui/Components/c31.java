package org.telegram.ui.Components;
public final class c31 implements rt0 {
    public int f32449a;
    public boolean f32450b;
    public final d31 f32451c;

    public c31(d31 d31Var) {
        this.f32451c = d31Var;
    }

    @Override
    public final void K(int i7, boolean z9) {
        if (this.f32449a != i7 || this.f32450b != z9) {
            this.f32449a = i7;
            this.f32450b = z9;
            if (i7 > org.telegram.messenger.g0.L(20.0f)) {
                d31 d31Var = this.f32451c;
                if (!d31Var.f32873g0) {
                    d31Var.f32879n0.f28700q0 = false;
                    d31Var.f32873g0 = true;
                }
            }
        }
    }
}
