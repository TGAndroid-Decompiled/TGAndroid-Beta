package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class pe0 implements Runnable {
    public final int f42480a;
    public final qe0 f42481b;

    public pe0(qe0 qe0Var, int i10) {
        this.f42480a = i10;
        this.f42481b = qe0Var;
    }

    @Override
    public final void run() {
        switch (this.f42480a) {
            case 0:
                qe0 qe0Var = this.f42481b;
                re0 re0Var = qe0Var.d;
                if (qe0Var.f42818b) {
                    boolean z10 = re0Var.K;
                    org.telegram.ui.Components.xj0 xj0Var = re0Var.J;
                    kd kdVar = re0Var.f43126n;
                    if (z10 && System.currentTimeMillis() - qe0Var.f42817a >= 10000) {
                        kdVar.setAnimation(xj0Var);
                        xj0Var.N(0, false, false);
                        xj0Var.f34757t0 = new pe0(qe0Var, 1);
                        kdVar.d();
                        qe0Var.f42817a = System.currentTimeMillis();
                    }
                    kdVar.postDelayed(qe0Var.f42819c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new pe0(this.f42481b, 2));
                return;
            default:
                re0 re0Var2 = this.f42481b.d;
                org.telegram.ui.Components.xj0 xj0Var2 = re0Var2.I;
                xj0Var2.N(0, false, false);
                re0Var2.f43126n.setAnimation(xj0Var2);
                return;
        }
    }
}
