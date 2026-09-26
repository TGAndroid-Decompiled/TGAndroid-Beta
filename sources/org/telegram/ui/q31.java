package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class q31 implements Runnable {
    public final int f36769a;
    public final s31 f36770b;

    public q31(s31 s31Var, int i10) {
        this.f36769a = i10;
        this.f36770b = s31Var;
    }

    @Override
    public final void run() {
        switch (this.f36769a) {
            case 0:
                s31 s31Var = this.f36770b;
                t31 t31Var = s31Var.v;
                if (s31Var.f37580a == 0) {
                    t31Var.dismiss();
                    return;
                } else {
                    t31Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f36770b.f37584n.f20491b);
                return;
        }
    }
}
