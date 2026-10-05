package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class q31 implements Runnable {
    public final int f39705a;
    public final s31 f39706b;

    public q31(s31 s31Var, int i10) {
        this.f39705a = i10;
        this.f39706b = s31Var;
    }

    @Override
    public final void run() {
        switch (this.f39705a) {
            case 0:
                s31 s31Var = this.f39706b;
                t31 t31Var = s31Var.v;
                if (s31Var.f40325a == 0) {
                    t31Var.dismiss();
                    return;
                } else {
                    t31Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f39706b.f40330n.f22315b);
                return;
        }
    }
}
