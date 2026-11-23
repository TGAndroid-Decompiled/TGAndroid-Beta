package org.telegram.ui.Components;

import org.telegram.ui.PremiumPreviewFragment;
public final class k8 implements Runnable {
    public final int f36858a;
    public final y8 f36859b;

    public k8(y8 y8Var, int i7) {
        this.f36858a = i7;
        this.f36859b = y8Var;
    }

    @Override
    public final void run() {
        switch (this.f36858a) {
            case 0:
                y8 y8Var = this.f36859b;
                if (!y8Var.V) {
                    if (y8Var.O > 0.0f) {
                        if (y8Var.N != null) {
                            y8Var.F = 1.0f;
                            y8Var.G = true;
                        }
                        org.telegram.messenger.g0.v1(y8Var.fragmentView);
                        return;
                    }
                    y8Var.l0(!y8Var.f42343a.f42008w, true, false);
                    return;
                }
                return;
            default:
                y8 y8Var2 = this.f36859b;
                y8Var2.getClass();
                y8Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                return;
        }
    }
}
