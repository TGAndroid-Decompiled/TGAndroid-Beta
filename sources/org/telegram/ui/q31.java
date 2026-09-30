package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class q31 implements Runnable {
    public final int f36870a;
    public final s31 f36871b;

    public q31(s31 s31Var, int i10) {
        this.f36870a = i10;
        this.f36871b = s31Var;
    }

    @Override
    public final void run() {
        switch (this.f36870a) {
            case 0:
                s31 s31Var = this.f36871b;
                t31 t31Var = s31Var.v;
                if (s31Var.f37677a == 0) {
                    t31Var.dismiss();
                    return;
                } else {
                    t31Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f36871b.f37681n.f20508b);
                return;
        }
    }
}
