package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ef0 implements Runnable {
    public final int f37295a;
    public final ff0 f37296b;

    public ef0(ff0 ff0Var, int i10) {
        this.f37295a = i10;
        this.f37296b = ff0Var;
    }

    @Override
    public final void run() {
        switch (this.f37295a) {
            case 0:
                ff0 ff0Var = this.f37296b;
                gf0 gf0Var = ff0Var.d;
                if (ff0Var.f37586b) {
                    boolean z10 = gf0Var.K;
                    org.telegram.ui.Components.dk0 dk0Var = gf0Var.J;
                    jd jdVar = gf0Var.f38049n;
                    if (z10 && System.currentTimeMillis() - ff0Var.f37585a >= 10000) {
                        jdVar.setAnimation(dk0Var);
                        dk0Var.N(0, false, false);
                        dk0Var.f25751t0 = new ef0(ff0Var, 1);
                        jdVar.d();
                        ff0Var.f37585a = System.currentTimeMillis();
                    }
                    jdVar.postDelayed(ff0Var.f37587c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ef0(this.f37296b, 2));
                return;
            default:
                gf0 gf0Var2 = this.f37296b.d;
                org.telegram.ui.Components.dk0 dk0Var2 = gf0Var2.I;
                dk0Var2.N(0, false, false);
                gf0Var2.f38049n.setAnimation(dk0Var2);
                return;
        }
    }
}
