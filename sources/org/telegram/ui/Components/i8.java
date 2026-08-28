package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PremiumPreviewFragment;
public final class i8 implements Runnable {
    public final int f29373a;
    public final w8 f29374b;

    public i8(w8 w8Var, int i9) {
        this.f29373a = i9;
        this.f29374b = w8Var;
    }

    @Override
    public final void run() {
        switch (this.f29373a) {
            case 0:
                w8 w8Var = this.f29374b;
                if (!w8Var.Q) {
                    if (w8Var.J > 0.0f) {
                        if (w8Var.I != null) {
                            w8Var.A = 1.0f;
                            w8Var.B = true;
                        }
                        AndroidUtilities.hideKeyboard(w8Var.fragmentView);
                        return;
                    }
                    w8Var.f0(!w8Var.f34138a.v, true, false);
                    return;
                }
                return;
            default:
                w8 w8Var2 = this.f29374b;
                w8Var2.getClass();
                w8Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                return;
        }
    }
}
