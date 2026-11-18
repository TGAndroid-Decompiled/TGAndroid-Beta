package org.telegram.ui.Components;

import org.telegram.ui.PremiumPreviewFragment;
public final class l8 implements Runnable {
    public final int f37065a;
    public final y8 f37066b;

    public l8(y8 y8Var, int i7) {
        this.f37065a = i7;
        this.f37066b = y8Var;
    }

    @Override
    public final void run() {
        switch (this.f37065a) {
            case 0:
                y8 y8Var = this.f37066b;
                if (!y8Var.V) {
                    if (y8Var.O > 0.0f) {
                        if (y8Var.N != null) {
                            y8Var.F = 1.0f;
                            y8Var.G = true;
                        }
                        org.telegram.messenger.g0.v1(y8Var.fragmentView);
                        return;
                    }
                    y8Var.l0(!y8Var.f42394a.f41945w, true, false);
                    return;
                }
                return;
            default:
                y8 y8Var2 = this.f37066b;
                y8Var2.getClass();
                y8Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                return;
        }
    }
}
