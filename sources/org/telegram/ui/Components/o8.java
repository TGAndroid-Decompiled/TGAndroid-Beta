package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PremiumPreviewFragment;
public final class o8 implements Runnable {
    public final int f27006a;
    public final d9 f27007b;

    public o8(d9 d9Var, int i10) {
        this.f27006a = i10;
        this.f27007b = d9Var;
    }

    @Override
    public final void run() {
        switch (this.f27006a) {
            case 0:
                d9 d9Var = this.f27007b;
                if (!d9Var.U) {
                    if (d9Var.N > 0.0f) {
                        if (d9Var.M != null) {
                            d9Var.E = 1.0f;
                            d9Var.F = true;
                        }
                        AndroidUtilities.hideKeyboard(d9Var.fragmentView);
                        return;
                    }
                    d9Var.g0(!d9Var.f23604a.v, true, false);
                    return;
                }
                return;
            default:
                d9 d9Var2 = this.f27007b;
                d9Var2.getClass();
                d9Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                return;
        }
    }
}
