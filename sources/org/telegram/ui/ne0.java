package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ne0 implements Runnable {
    public final int f40787a;
    public final oe0 f40788b;

    public ne0(oe0 oe0Var, int i10) {
        this.f40787a = i10;
        this.f40788b = oe0Var;
    }

    @Override
    public final void run() {
        switch (this.f40787a) {
            case 0:
                oe0 oe0Var = this.f40788b;
                pe0 pe0Var = oe0Var.d;
                if (oe0Var.f41102b) {
                    boolean z10 = pe0Var.G;
                    org.telegram.ui.Components.xi0 xi0Var = pe0Var.F;
                    ed edVar = pe0Var.f41390n;
                    if (z10 && System.currentTimeMillis() - oe0Var.f41101a >= 10000) {
                        edVar.setAnimation(xi0Var);
                        xi0Var.L(0, false, false);
                        xi0Var.f34751q0 = new ne0(oe0Var, 1);
                        edVar.d();
                        oe0Var.f41101a = System.currentTimeMillis();
                    }
                    edVar.postDelayed(oe0Var.f41103c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ne0(this.f40788b, 2));
                return;
            default:
                pe0 pe0Var2 = this.f40788b.d;
                org.telegram.ui.Components.xi0 xi0Var2 = pe0Var2.E;
                xi0Var2.L(0, false, false);
                pe0Var2.f41390n.setAnimation(xi0Var2);
                return;
        }
    }
}
