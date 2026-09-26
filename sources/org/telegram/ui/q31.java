package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class q31 implements Runnable {
    public final int f36770a;
    public final s31 f36771b;

    public q31(s31 s31Var, int i10) {
        this.f36770a = i10;
        this.f36771b = s31Var;
    }

    @Override
    public final void run() {
        switch (this.f36770a) {
            case 0:
                s31 s31Var = this.f36771b;
                t31 t31Var = s31Var.v;
                if (s31Var.f37581a == 0) {
                    t31Var.dismiss();
                    return;
                } else {
                    t31Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f36771b.f37585n.f20491b);
                return;
        }
    }
}
