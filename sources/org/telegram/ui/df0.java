package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class df0 implements Runnable {
    public final int f35763a;
    public final ef0 f35764b;

    public df0(ef0 ef0Var, int i10) {
        this.f35763a = i10;
        this.f35764b = ef0Var;
    }

    @Override
    public final void run() {
        switch (this.f35763a) {
            case 0:
                ef0 ef0Var = this.f35764b;
                ff0 ff0Var = ef0Var.d;
                if (ef0Var.f36016b) {
                    boolean z10 = ff0Var.K;
                    org.telegram.ui.Components.kj0 kj0Var = ff0Var.J;
                    kd kdVar = ff0Var.f36295n;
                    if (z10 && System.currentTimeMillis() - ef0Var.f36015a >= 10000) {
                        kdVar.setAnimation(kj0Var);
                        kj0Var.N(0, false, false);
                        kj0Var.f28149t0 = new df0(ef0Var, 1);
                        kdVar.d();
                        ef0Var.f36015a = System.currentTimeMillis();
                    }
                    kdVar.postDelayed(ef0Var.f36017c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new df0(this.f35764b, 2));
                return;
            default:
                ff0 ff0Var2 = this.f35764b.d;
                org.telegram.ui.Components.kj0 kj0Var2 = ff0Var2.I;
                kj0Var2.N(0, false, false);
                ff0Var2.f36295n.setAnimation(kj0Var2);
                return;
        }
    }
}
