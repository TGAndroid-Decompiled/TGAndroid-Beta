package org.telegram.ui.Components;
public final class c31 implements qt0 {
    public int f32445a;
    public boolean f32446b;
    public final d31 f32447c;

    public c31(d31 d31Var) {
        this.f32447c = d31Var;
    }

    @Override
    public final void K(int i7, boolean z9) {
        if (this.f32445a != i7 || this.f32446b != z9) {
            this.f32445a = i7;
            this.f32446b = z9;
            if (i7 > org.telegram.messenger.g0.L(20.0f)) {
                d31 d31Var = this.f32447c;
                if (!d31Var.f32775g0) {
                    d31Var.f32781n0.f28644q0 = false;
                    d31Var.f32775g0 = true;
                }
            }
        }
    }
}
