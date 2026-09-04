package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ff0 implements Runnable {
    public final int f36389a;
    public final gf0 f36390b;

    public ff0(gf0 gf0Var, int i10) {
        this.f36389a = i10;
        this.f36390b = gf0Var;
    }

    @Override
    public final void run() {
        switch (this.f36389a) {
            case 0:
                gf0 gf0Var = this.f36390b;
                hf0 hf0Var = gf0Var.d;
                if (gf0Var.f36661b) {
                    boolean z10 = hf0Var.K;
                    org.telegram.ui.Components.xi0 xi0Var = hf0Var.J;
                    jd jdVar = hf0Var.f36985n;
                    if (z10 && System.currentTimeMillis() - gf0Var.f36660a >= 10000) {
                        jdVar.setAnimation(xi0Var);
                        xi0Var.L(0, false, false);
                        xi0Var.f32577u0 = new ff0(gf0Var, 1);
                        jdVar.d();
                        gf0Var.f36660a = System.currentTimeMillis();
                    }
                    jdVar.postDelayed(gf0Var.f36662c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ff0(this.f36390b, 2));
                return;
            default:
                hf0 hf0Var2 = this.f36390b.d;
                org.telegram.ui.Components.xi0 xi0Var2 = hf0Var2.I;
                xi0Var2.L(0, false, false);
                hf0Var2.f36985n.setAnimation(xi0Var2);
                return;
        }
    }
}
