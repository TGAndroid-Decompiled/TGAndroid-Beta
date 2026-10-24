package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PremiumPreviewFragment;
public final class o8 implements Runnable {
    public final int f29167a;
    public final c9 f29168b;

    public o8(c9 c9Var, int i10) {
        this.f29167a = i10;
        this.f29168b = c9Var;
    }

    @Override
    public final void run() {
        switch (this.f29167a) {
            case 0:
                c9 c9Var = this.f29168b;
                if (!c9Var.U) {
                    if (c9Var.N > 0.0f) {
                        if (c9Var.M != null) {
                            c9Var.E = 1.0f;
                            c9Var.F = true;
                        }
                        AndroidUtilities.hideKeyboard(c9Var.fragmentView);
                        return;
                    }
                    c9Var.g0(!c9Var.f25256a.v, true, false);
                    return;
                }
                return;
            default:
                c9 c9Var2 = this.f29168b;
                c9Var2.getClass();
                c9Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                return;
        }
    }
}
