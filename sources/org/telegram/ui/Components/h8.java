package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PremiumPreviewFragment;

public final class h8 implements Runnable {

    public final int f28939a;

    public final v8 f28940b;

    public h8(v8 v8Var, int i10) {
        this.f28939a = i10;
        this.f28940b = v8Var;
    }

    @Override
    public final void run() {
        switch (this.f28939a) {
            case 0:
                v8 v8Var = this.f28940b;
                if (!v8Var.Q) {
                    if (v8Var.J <= 0.0f) {
                        v8Var.g0(!v8Var.f33295a.v, true, false);
                    } else {
                        if (v8Var.I != null) {
                            v8Var.A = 1.0f;
                            v8Var.B = true;
                        }
                        AndroidUtilities.hideKeyboard(v8Var.fragmentView);
                    }
                    break;
                }
                break;
            default:
                v8 v8Var2 = this.f28940b;
                v8Var2.getClass();
                v8Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                break;
        }
    }
}
