package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PremiumPreviewFragment;
public final class t8 implements Runnable {
    public final int f28994a;
    public final h9 f28995b;

    public t8(h9 h9Var, int i10) {
        this.f28994a = i10;
        this.f28995b = h9Var;
    }

    @Override
    public final void run() {
        switch (this.f28994a) {
            case 0:
                h9 h9Var = this.f28995b;
                if (!h9Var.U) {
                    if (h9Var.N > 0.0f) {
                        if (h9Var.M != null) {
                            h9Var.E = 1.0f;
                            h9Var.F = true;
                        }
                        AndroidUtilities.hideKeyboard(h9Var.fragmentView);
                        return;
                    }
                    h9Var.g0(!h9Var.f25209a.v, true, false);
                    return;
                }
                return;
            default:
                h9 h9Var2 = this.f28995b;
                h9Var2.getClass();
                h9Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                return;
        }
    }
}
