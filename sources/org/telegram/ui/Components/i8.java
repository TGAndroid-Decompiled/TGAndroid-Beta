package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PremiumPreviewFragment;
public final class i8 implements Runnable {
    public final int f27696a;
    public final w8 f27697b;

    public i8(w8 w8Var, int i10) {
        this.f27696a = i10;
        this.f27697b = w8Var;
    }

    @Override
    public final void run() {
        switch (this.f27696a) {
            case 0:
                w8 w8Var = this.f27697b;
                if (!w8Var.R) {
                    if (w8Var.K > 0.0f) {
                        if (w8Var.J != null) {
                            w8Var.B = 1.0f;
                            w8Var.C = true;
                        }
                        AndroidUtilities.hideKeyboard(w8Var.fragmentView);
                        return;
                    }
                    w8Var.g0(!w8Var.f32670a.v, true, false);
                    return;
                }
                return;
            default:
                w8 w8Var2 = this.f27697b;
                w8Var2.getClass();
                w8Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                return;
        }
    }
}
