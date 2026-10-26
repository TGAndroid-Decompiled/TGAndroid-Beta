package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PremiumPreviewFragment;
public final class s8 implements Runnable {
    public final int f32451a;
    public final g9 f32452b;

    public s8(g9 g9Var, int i10) {
        this.f32451a = i10;
        this.f32452b = g9Var;
    }

    @Override
    public final void run() {
        switch (this.f32451a) {
            case 0:
                g9 g9Var = this.f32452b;
                if (!g9Var.U) {
                    if (g9Var.N > 0.0f) {
                        if (g9Var.M != null) {
                            g9Var.E = 1.0f;
                            g9Var.F = true;
                        }
                        AndroidUtilities.hideKeyboard(g9Var.fragmentView);
                        return;
                    }
                    g9Var.h0(!g9Var.f28489a.v, true, false);
                    return;
                }
                return;
            default:
                g9 g9Var2 = this.f32452b;
                g9Var2.getClass();
                g9Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                return;
        }
    }
}
