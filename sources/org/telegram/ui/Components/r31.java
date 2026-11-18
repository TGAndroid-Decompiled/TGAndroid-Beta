package org.telegram.ui.Components;
public final class r31 implements zt0 {
    public int f38999a;
    public boolean f39000b;
    public final s31 f39001c;

    public r31(s31 s31Var) {
        this.f39001c = s31Var;
    }

    @Override
    public final void L(int i7, boolean z10) {
        if (this.f38999a != i7 || this.f39000b != z10) {
            this.f38999a = i7;
            this.f39000b = z10;
            if (i7 > org.telegram.messenger.g0.L(20.0f)) {
                s31 s31Var = this.f39001c;
                if (!s31Var.f39473h0) {
                    s31Var.f39479o0.f30223r0 = false;
                    s31Var.f39473h0 = true;
                }
            }
        }
    }
}
