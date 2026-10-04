package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class df0 implements Runnable {
    public final int f35757a;
    public final ef0 f35758b;

    public df0(ef0 ef0Var, int i10) {
        this.f35757a = i10;
        this.f35758b = ef0Var;
    }

    @Override
    public final void run() {
        switch (this.f35757a) {
            case 0:
                ef0 ef0Var = this.f35758b;
                ff0 ff0Var = ef0Var.d;
                if (ef0Var.f36010b) {
                    boolean z10 = ff0Var.K;
                    org.telegram.ui.Components.kj0 kj0Var = ff0Var.J;
                    kd kdVar = ff0Var.f36289n;
                    if (z10 && System.currentTimeMillis() - ef0Var.f36009a >= 10000) {
                        kdVar.setAnimation(kj0Var);
                        kj0Var.N(0, false, false);
                        kj0Var.f28143t0 = new df0(ef0Var, 1);
                        kdVar.d();
                        ef0Var.f36009a = System.currentTimeMillis();
                    }
                    kdVar.postDelayed(ef0Var.f36011c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new df0(this.f35758b, 2));
                return;
            default:
                ff0 ff0Var2 = this.f35758b.d;
                org.telegram.ui.Components.kj0 kj0Var2 = ff0Var2.I;
                kj0Var2.N(0, false, false);
                ff0Var2.f36289n.setAnimation(kj0Var2);
                return;
        }
    }
}
