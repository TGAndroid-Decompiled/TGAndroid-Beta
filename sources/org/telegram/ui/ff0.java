package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ff0 implements Runnable {
    public final int f33561a;
    public final gf0 f33562b;

    public ff0(gf0 gf0Var, int i10) {
        this.f33561a = i10;
        this.f33562b = gf0Var;
    }

    @Override
    public final void run() {
        switch (this.f33561a) {
            case 0:
                gf0 gf0Var = this.f33562b;
                hf0 hf0Var = gf0Var.d;
                if (gf0Var.f33892b) {
                    boolean z10 = hf0Var.K;
                    org.telegram.ui.Components.xi0 xi0Var = hf0Var.J;
                    id idVar = hf0Var.f34264n;
                    if (z10 && System.currentTimeMillis() - gf0Var.f33891a >= 10000) {
                        idVar.setAnimation(xi0Var);
                        xi0Var.N(0, false, false);
                        xi0Var.f29971u0 = new ff0(gf0Var, 1);
                        idVar.d();
                        gf0Var.f33891a = System.currentTimeMillis();
                    }
                    idVar.postDelayed(gf0Var.f33893c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ff0(this.f33562b, 2));
                return;
            default:
                hf0 hf0Var2 = this.f33562b.d;
                org.telegram.ui.Components.xi0 xi0Var2 = hf0Var2.I;
                xi0Var2.N(0, false, false);
                hf0Var2.f34264n.setAnimation(xi0Var2);
                return;
        }
    }
}
