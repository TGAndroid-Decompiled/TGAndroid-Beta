package org.telegram.ui.Components;

import org.telegram.ui.PremiumPreviewFragment;
public final class j8 implements Runnable {
    public final int f36351a;
    public final x8 f36352b;

    public j8(x8 x8Var, int i7) {
        this.f36351a = i7;
        this.f36352b = x8Var;
    }

    @Override
    public final void run() {
        switch (this.f36351a) {
            case 0:
                x8 x8Var = this.f36352b;
                if (!x8Var.V) {
                    if (x8Var.O > 0.0f) {
                        if (x8Var.N != null) {
                            x8Var.F = 1.0f;
                            x8Var.G = true;
                        }
                        org.telegram.messenger.g0.v1(x8Var.fragmentView);
                        return;
                    }
                    x8Var.l0(!x8Var.f41918a.f41543w, true, false);
                    return;
                }
                return;
            default:
                x8 x8Var2 = this.f36352b;
                x8Var2.getClass();
                x8Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                return;
        }
    }
}
