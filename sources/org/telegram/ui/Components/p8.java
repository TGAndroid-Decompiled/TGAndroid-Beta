package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PremiumPreviewFragment;
public final class p8 implements Runnable {
    public final int f29564a;
    public final e9 f29565b;

    public p8(e9 e9Var, int i10) {
        this.f29564a = i10;
        this.f29565b = e9Var;
    }

    @Override
    public final void run() {
        switch (this.f29564a) {
            case 0:
                e9 e9Var = this.f29565b;
                if (!e9Var.U) {
                    if (e9Var.N > 0.0f) {
                        if (e9Var.M != null) {
                            e9Var.E = 1.0f;
                            e9Var.F = true;
                        }
                        AndroidUtilities.hideKeyboard(e9Var.fragmentView);
                        return;
                    }
                    e9Var.g0(!e9Var.f26003a.v, true, false);
                    return;
                }
                return;
            default:
                e9 e9Var2 = this.f29565b;
                e9Var2.getClass();
                e9Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                return;
        }
    }
}
