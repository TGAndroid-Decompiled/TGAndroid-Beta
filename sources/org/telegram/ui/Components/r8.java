package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PremiumPreviewFragment;
public final class r8 implements Runnable {
    public final int f29985a;
    public final f9 f29986b;

    public r8(f9 f9Var, int i10) {
        this.f29985a = i10;
        this.f29986b = f9Var;
    }

    @Override
    public final void run() {
        switch (this.f29985a) {
            case 0:
                f9 f9Var = this.f29986b;
                if (!f9Var.U) {
                    if (f9Var.N > 0.0f) {
                        if (f9Var.M != null) {
                            f9Var.E = 1.0f;
                            f9Var.F = true;
                        }
                        AndroidUtilities.hideKeyboard(f9Var.fragmentView);
                        return;
                    }
                    f9Var.g0(!f9Var.f25964a.v, true, false);
                    return;
                }
                return;
            default:
                f9 f9Var2 = this.f29986b;
                f9Var2.getClass();
                f9Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                return;
        }
    }
}
