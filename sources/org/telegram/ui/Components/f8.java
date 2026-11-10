package org.telegram.ui.Components;

import org.telegram.ui.PremiumPreviewFragment;
public final class f8 implements Runnable {
    public final int f33497a;
    public final s8 f33498b;

    public f8(s8 s8Var, int i7) {
        this.f33497a = i7;
        this.f33498b = s8Var;
    }

    @Override
    public final void run() {
        switch (this.f33497a) {
            case 0:
                s8 s8Var = this.f33498b;
                if (!s8Var.U) {
                    if (s8Var.N > 0.0f) {
                        if (s8Var.M != null) {
                            s8Var.E = 1.0f;
                            s8Var.F = true;
                        }
                        org.telegram.messenger.g0.v1(s8Var.fragmentView);
                        return;
                    }
                    s8Var.l0(!s8Var.f37887a.f37564w, true, false);
                    return;
                }
                return;
            default:
                s8 s8Var2 = this.f33498b;
                s8Var2.getClass();
                s8Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                return;
        }
    }
}
