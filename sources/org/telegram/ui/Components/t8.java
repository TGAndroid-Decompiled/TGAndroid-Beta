package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PremiumPreviewFragment;
public final class t8 implements Runnable {
    public final int f29292a;
    public final h9 f29293b;

    public t8(h9 h9Var, int i10) {
        this.f29292a = i10;
        this.f29293b = h9Var;
    }

    @Override
    public final void run() {
        switch (this.f29292a) {
            case 0:
                h9 h9Var = this.f29293b;
                if (!h9Var.U) {
                    if (h9Var.N > 0.0f) {
                        if (h9Var.M != null) {
                            h9Var.E = 1.0f;
                            h9Var.F = true;
                        }
                        AndroidUtilities.hideKeyboard(h9Var.fragmentView);
                        return;
                    }
                    h9Var.g0(!h9Var.f25564a.v, true, false);
                    return;
                }
                return;
            default:
                h9 h9Var2 = this.f29293b;
                h9Var2.getClass();
                h9Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                return;
        }
    }
}
