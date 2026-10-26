package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class pe0 implements Runnable {
    public final int f42483a;
    public final qe0 f42484b;

    public pe0(qe0 qe0Var, int i10) {
        this.f42483a = i10;
        this.f42484b = qe0Var;
    }

    @Override
    public final void run() {
        switch (this.f42483a) {
            case 0:
                qe0 qe0Var = this.f42484b;
                re0 re0Var = qe0Var.d;
                if (qe0Var.f42821b) {
                    boolean z10 = re0Var.K;
                    org.telegram.ui.Components.xj0 xj0Var = re0Var.J;
                    kd kdVar = re0Var.f43129n;
                    if (z10 && System.currentTimeMillis() - qe0Var.f42820a >= 10000) {
                        kdVar.setAnimation(xj0Var);
                        xj0Var.N(0, false, false);
                        xj0Var.f34760t0 = new pe0(qe0Var, 1);
                        kdVar.d();
                        qe0Var.f42820a = System.currentTimeMillis();
                    }
                    kdVar.postDelayed(qe0Var.f42822c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new pe0(this.f42484b, 2));
                return;
            default:
                re0 re0Var2 = this.f42484b.d;
                org.telegram.ui.Components.xj0 xj0Var2 = re0Var2.I;
                xj0Var2.N(0, false, false);
                re0Var2.f43129n.setAnimation(xj0Var2);
                return;
        }
    }
}
