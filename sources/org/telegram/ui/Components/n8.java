package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PremiumPreviewFragment;
public final class n8 implements Runnable {
    public final int f26392a;
    public final c9 f26393b;

    public n8(c9 c9Var, int i10) {
        this.f26392a = i10;
        this.f26393b = c9Var;
    }

    @Override
    public final void run() {
        switch (this.f26392a) {
            case 0:
                c9 c9Var = this.f26393b;
                if (!c9Var.U) {
                    if (c9Var.N > 0.0f) {
                        if (c9Var.M != null) {
                            c9Var.E = 1.0f;
                            c9Var.F = true;
                        }
                        AndroidUtilities.hideKeyboard(c9Var.fragmentView);
                        return;
                    }
                    c9Var.g0(!c9Var.f22981a.v, true, false);
                    return;
                }
                return;
            default:
                c9 c9Var2 = this.f26393b;
                c9Var2.getClass();
                c9Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                return;
        }
    }
}
