package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class oe0 implements Runnable {
    public final int f41129a;
    public final pe0 f41130b;

    public oe0(pe0 pe0Var, int i9) {
        this.f41129a = i9;
        this.f41130b = pe0Var;
    }

    @Override
    public final void run() {
        switch (this.f41129a) {
            case 0:
                pe0 pe0Var = this.f41130b;
                qe0 qe0Var = pe0Var.d;
                if (pe0Var.f41499b) {
                    boolean z10 = qe0Var.G;
                    org.telegram.ui.Components.mi0 mi0Var = qe0Var.F;
                    fd fdVar = qe0Var.f41776n;
                    if (z10 && System.currentTimeMillis() - pe0Var.f41498a >= 10000) {
                        fdVar.setAnimation(mi0Var);
                        mi0Var.L(0, false, false);
                        mi0Var.f30861q0 = new oe0(pe0Var, 1);
                        fdVar.d();
                        pe0Var.f41498a = System.currentTimeMillis();
                    }
                    fdVar.postDelayed(pe0Var.f41500c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new oe0(this.f41130b, 2));
                return;
            default:
                qe0 qe0Var2 = this.f41130b.d;
                org.telegram.ui.Components.mi0 mi0Var2 = qe0Var2.E;
                mi0Var2.L(0, false, false);
                qe0Var2.f41776n.setAnimation(mi0Var2);
                return;
        }
    }
}
