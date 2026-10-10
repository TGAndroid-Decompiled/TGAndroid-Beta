package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PremiumPreviewFragment;
public final class r8 implements Runnable {
    public final int f30415a;
    public final g9 f30416b;

    public r8(g9 g9Var, int i10) {
        this.f30415a = i10;
        this.f30416b = g9Var;
    }

    @Override
    public final void run() {
        switch (this.f30415a) {
            case 0:
                g9 g9Var = this.f30416b;
                if (!g9Var.U) {
                    if (g9Var.N > 0.0f) {
                        if (g9Var.M != null) {
                            g9Var.E = 1.0f;
                            g9Var.F = true;
                        }
                        AndroidUtilities.hideKeyboard(g9Var.fragmentView);
                        return;
                    }
                    g9Var.g0(!g9Var.f26640a.v, true, false);
                    return;
                }
                return;
            default:
                g9 g9Var2 = this.f30416b;
                g9Var2.getClass();
                g9Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                return;
        }
    }
}
