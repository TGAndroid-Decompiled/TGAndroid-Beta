package org.telegram.ui.Components;

import org.telegram.ui.PremiumPreviewFragment;
public final class b8 implements Runnable {
    public final int f24580a;
    public final o8 f24581b;

    public b8(o8 o8Var, int i10) {
        this.f24580a = i10;
        this.f24581b = o8Var;
    }

    @Override
    public final void run() {
        switch (this.f24580a) {
            case 0:
                o8 o8Var = this.f24581b;
                if (!o8Var.U) {
                    if (o8Var.N > 0.0f) {
                        if (o8Var.M != null) {
                            o8Var.E = 1.0f;
                            o8Var.F = true;
                        }
                        org.telegram.messenger.i0.v1(o8Var.fragmentView);
                        return;
                    }
                    o8Var.k0(!o8Var.f28987a.f28711w, true, false);
                    return;
                }
                return;
            default:
                o8 o8Var2 = this.f24581b;
                o8Var2.getClass();
                o8Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                return;
        }
    }
}
