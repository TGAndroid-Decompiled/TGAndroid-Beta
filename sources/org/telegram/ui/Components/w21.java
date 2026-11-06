package org.telegram.ui.Components;
public final class w21 implements qt0 {
    public int f39817a;
    public boolean f39818b;
    public final x21 f39819c;

    public w21(x21 x21Var) {
        this.f39819c = x21Var;
    }

    @Override
    public final void K(int i7, boolean z9) {
        if (this.f39817a != i7 || this.f39818b != z9) {
            this.f39817a = i7;
            this.f39818b = z9;
            if (i7 > org.telegram.messenger.g0.L(20.0f)) {
                x21 x21Var = this.f39819c;
                if (!x21Var.f40130g0) {
                    x21Var.f40136n0.f28640q0 = false;
                    x21Var.f40130g0 = true;
                }
            }
        }
    }
}
