package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class q31 implements Runnable {
    public final int f36755a;
    public final s31 f36756b;

    public q31(s31 s31Var, int i10) {
        this.f36755a = i10;
        this.f36756b = s31Var;
    }

    @Override
    public final void run() {
        switch (this.f36755a) {
            case 0:
                s31 s31Var = this.f36756b;
                t31 t31Var = s31Var.v;
                if (s31Var.f37566a == 0) {
                    t31Var.dismiss();
                    return;
                } else {
                    t31Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f36756b.f37570n.f20477b);
                return;
        }
    }
}
