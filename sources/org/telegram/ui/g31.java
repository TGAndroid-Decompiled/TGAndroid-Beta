package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class g31 implements Runnable {
    public final int f34444a;
    public final j31 f34445b;

    public g31(j31 j31Var, int i10) {
        this.f34444a = i10;
        this.f34445b = j31Var;
    }

    @Override
    public final void run() {
        switch (this.f34444a) {
            case 0:
                j31 j31Var = this.f34445b;
                k31 k31Var = j31Var.v;
                if (j31Var.f35216a == 0) {
                    k31Var.dismiss();
                    return;
                } else {
                    k31Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f34445b.f35220n.f21199b);
                return;
        }
    }
}
