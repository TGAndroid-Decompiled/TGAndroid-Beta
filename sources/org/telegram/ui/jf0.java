package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class jf0 implements Runnable {
    public final int f37045a;
    public final kf0 f37046b;

    public jf0(kf0 kf0Var, int i10) {
        this.f37045a = i10;
        this.f37046b = kf0Var;
    }

    @Override
    public final void run() {
        switch (this.f37045a) {
            case 0:
                kf0 kf0Var = this.f37046b;
                lf0 lf0Var = kf0Var.d;
                if (kf0Var.f37370b) {
                    boolean z10 = lf0Var.K;
                    org.telegram.ui.Components.yj0 yj0Var = lf0Var.J;
                    pd pdVar = lf0Var.f37734n;
                    if (z10 && System.currentTimeMillis() - kf0Var.f37369a >= 10000) {
                        pdVar.setAnimation(yj0Var);
                        yj0Var.N(0, false, false);
                        yj0Var.f31309t0 = new jf0(kf0Var, 1);
                        pdVar.d();
                        kf0Var.f37369a = System.currentTimeMillis();
                    }
                    pdVar.postDelayed(kf0Var.f37371c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new jf0(this.f37046b, 2));
                return;
            default:
                lf0 lf0Var2 = this.f37046b.d;
                org.telegram.ui.Components.yj0 yj0Var2 = lf0Var2.I;
                yj0Var2.N(0, false, false);
                lf0Var2.f37734n.setAnimation(yj0Var2);
                return;
        }
    }
}
