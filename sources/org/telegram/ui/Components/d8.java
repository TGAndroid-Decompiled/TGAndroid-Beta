package org.telegram.ui.Components;

import org.telegram.ui.PremiumPreviewFragment;
public final class d8 implements Runnable {
    public final int f33862a;
    public final q8 f33863b;

    public d8(q8 q8Var, int i7) {
        this.f33862a = i7;
        this.f33863b = q8Var;
    }

    @Override
    public final void run() {
        switch (this.f33862a) {
            case 0:
                q8 q8Var = this.f33863b;
                if (!q8Var.V) {
                    if (q8Var.O > 0.0f) {
                        if (q8Var.N != null) {
                            q8Var.F = 1.0f;
                            q8Var.G = true;
                        }
                        org.telegram.messenger.g0.v1(q8Var.fragmentView);
                        return;
                    }
                    q8Var.l0(!q8Var.f38562a.f38246w, true, false);
                    return;
                }
                return;
            default:
                q8 q8Var2 = this.f33863b;
                q8Var2.getClass();
                q8Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                return;
        }
    }
}
