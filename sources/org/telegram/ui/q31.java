package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class q31 implements Runnable {
    public final int f36771a;
    public final s31 f36772b;

    public q31(s31 s31Var, int i10) {
        this.f36771a = i10;
        this.f36772b = s31Var;
    }

    @Override
    public final void run() {
        switch (this.f36771a) {
            case 0:
                s31 s31Var = this.f36772b;
                t31 t31Var = s31Var.v;
                if (s31Var.f37582a == 0) {
                    t31Var.dismiss();
                    return;
                } else {
                    t31Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f36772b.f37586n.f20492b);
                return;
        }
    }
}
