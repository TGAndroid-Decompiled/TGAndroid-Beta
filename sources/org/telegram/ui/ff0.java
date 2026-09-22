package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ff0 implements Runnable {
    public final int f33586a;
    public final gf0 f33587b;

    public ff0(gf0 gf0Var, int i10) {
        this.f33586a = i10;
        this.f33587b = gf0Var;
    }

    @Override
    public final void run() {
        switch (this.f33586a) {
            case 0:
                gf0 gf0Var = this.f33587b;
                hf0 hf0Var = gf0Var.d;
                if (gf0Var.f33844b) {
                    boolean z10 = hf0Var.K;
                    org.telegram.ui.Components.xi0 xi0Var = hf0Var.J;
                    id idVar = hf0Var.f34247n;
                    if (z10 && System.currentTimeMillis() - gf0Var.f33843a >= 10000) {
                        idVar.setAnimation(xi0Var);
                        xi0Var.N(0, false, false);
                        xi0Var.f29967t0 = new ff0(gf0Var, 1);
                        idVar.d();
                        gf0Var.f33843a = System.currentTimeMillis();
                    }
                    idVar.postDelayed(gf0Var.f33845c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ff0(this.f33587b, 2));
                return;
            default:
                hf0 hf0Var2 = this.f33587b.d;
                org.telegram.ui.Components.xi0 xi0Var2 = hf0Var2.I;
                xi0Var2.N(0, false, false);
                hf0Var2.f34247n.setAnimation(xi0Var2);
                return;
        }
    }
}
