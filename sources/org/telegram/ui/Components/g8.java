package org.telegram.ui.Components;

import org.telegram.ui.PremiumPreviewFragment;
public final class g8 implements Runnable {
    public final int f33876a;
    public final t8 f33877b;

    public g8(t8 t8Var, int i7) {
        this.f33876a = i7;
        this.f33877b = t8Var;
    }

    @Override
    public final void run() {
        switch (this.f33876a) {
            case 0:
                t8 t8Var = this.f33877b;
                if (!t8Var.U) {
                    if (t8Var.N > 0.0f) {
                        if (t8Var.M != null) {
                            t8Var.E = 1.0f;
                            t8Var.F = true;
                        }
                        org.telegram.messenger.g0.v1(t8Var.fragmentView);
                        return;
                    }
                    t8Var.l0(!t8Var.f38292a.f37954w, true, false);
                    return;
                }
                return;
            default:
                t8 t8Var2 = this.f33877b;
                t8Var2.getClass();
                t8Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                return;
        }
    }
}
