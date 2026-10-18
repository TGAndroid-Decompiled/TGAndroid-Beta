package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ne0 implements Runnable {
    public final int f39418a;
    public final oe0 f39419b;

    public ne0(oe0 oe0Var, int i10) {
        this.f39418a = i10;
        this.f39419b = oe0Var;
    }

    @Override
    public final void run() {
        switch (this.f39418a) {
            case 0:
                oe0 oe0Var = this.f39419b;
                pe0 pe0Var = oe0Var.d;
                if (oe0Var.f39770b) {
                    boolean z10 = pe0Var.K;
                    org.telegram.ui.Components.uj0 uj0Var = pe0Var.J;
                    ld ldVar = pe0Var.f40076n;
                    if (z10 && System.currentTimeMillis() - oe0Var.f39769a >= 10000) {
                        ldVar.setAnimation(uj0Var);
                        uj0Var.N(0, false, false);
                        uj0Var.f31025t0 = new ne0(oe0Var, 1);
                        ldVar.d();
                        oe0Var.f39769a = System.currentTimeMillis();
                    }
                    ldVar.postDelayed(oe0Var.f39771c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ne0(this.f39419b, 2));
                return;
            default:
                pe0 pe0Var2 = this.f39419b.d;
                org.telegram.ui.Components.uj0 uj0Var2 = pe0Var2.I;
                uj0Var2.N(0, false, false);
                pe0Var2.f40076n.setAnimation(uj0Var2);
                return;
        }
    }
}
