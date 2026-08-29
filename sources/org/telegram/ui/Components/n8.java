package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PremiumPreviewFragment;
public final class n8 implements Runnable {
    public final int f30924a;
    public final b9 f30925b;

    public n8(b9 b9Var, int i10) {
        this.f30924a = i10;
        this.f30925b = b9Var;
    }

    @Override
    public final void run() {
        switch (this.f30924a) {
            case 0:
                b9 b9Var = this.f30925b;
                if (!b9Var.Q) {
                    if (b9Var.J > 0.0f) {
                        if (b9Var.I != null) {
                            b9Var.A = 1.0f;
                            b9Var.B = true;
                        }
                        AndroidUtilities.hideKeyboard(b9Var.fragmentView);
                        return;
                    }
                    b9Var.g0(!b9Var.f27003a.v, true, false);
                    return;
                }
                return;
            default:
                b9 b9Var2 = this.f30925b;
                b9Var2.getClass();
                b9Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                return;
        }
    }
}
