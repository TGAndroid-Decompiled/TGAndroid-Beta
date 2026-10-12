package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class kf0 implements Runnable {
    public final int f37641a;
    public final lf0 f37642b;

    public kf0(lf0 lf0Var, int i10) {
        this.f37641a = i10;
        this.f37642b = lf0Var;
    }

    @Override
    public final void run() {
        switch (this.f37641a) {
            case 0:
                lf0 lf0Var = this.f37642b;
                mf0 mf0Var = lf0Var.d;
                if (lf0Var.f37946b) {
                    boolean z10 = mf0Var.K;
                    org.telegram.ui.Components.yj0 yj0Var = mf0Var.J;
                    pd pdVar = mf0Var.f38246n;
                    if (z10 && System.currentTimeMillis() - lf0Var.f37945a >= 10000) {
                        pdVar.setAnimation(yj0Var);
                        yj0Var.N(0, false, false);
                        yj0Var.f31626t0 = new kf0(lf0Var, 1);
                        pdVar.d();
                        lf0Var.f37945a = System.currentTimeMillis();
                    }
                    pdVar.postDelayed(lf0Var.f37947c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new kf0(this.f37642b, 2));
                return;
            default:
                mf0 mf0Var2 = this.f37642b.d;
                org.telegram.ui.Components.yj0 yj0Var2 = mf0Var2.I;
                yj0Var2.N(0, false, false);
                mf0Var2.f38246n.setAnimation(yj0Var2);
                return;
        }
    }
}
