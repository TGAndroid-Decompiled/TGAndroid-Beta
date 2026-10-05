package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class df0 implements Runnable {
    public final int f35799a;
    public final ef0 f35800b;

    public df0(ef0 ef0Var, int i10) {
        this.f35799a = i10;
        this.f35800b = ef0Var;
    }

    @Override
    public final void run() {
        switch (this.f35799a) {
            case 0:
                ef0 ef0Var = this.f35800b;
                ff0 ff0Var = ef0Var.d;
                if (ef0Var.f36044b) {
                    boolean z10 = ff0Var.K;
                    org.telegram.ui.Components.kj0 kj0Var = ff0Var.J;
                    kd kdVar = ff0Var.f36296n;
                    if (z10 && System.currentTimeMillis() - ef0Var.f36043a >= 10000) {
                        kdVar.setAnimation(kj0Var);
                        kj0Var.N(0, false, false);
                        kj0Var.f28235t0 = new df0(ef0Var, 1);
                        kdVar.d();
                        ef0Var.f36043a = System.currentTimeMillis();
                    }
                    kdVar.postDelayed(ef0Var.f36045c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new df0(this.f35800b, 2));
                return;
            default:
                ff0 ff0Var2 = this.f35800b.d;
                org.telegram.ui.Components.kj0 kj0Var2 = ff0Var2.I;
                kj0Var2.N(0, false, false);
                ff0Var2.f36296n.setAnimation(kj0Var2);
                return;
        }
    }
}
