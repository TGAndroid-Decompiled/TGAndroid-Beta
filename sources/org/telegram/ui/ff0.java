package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ff0 implements Runnable {
    public final int f36416a;
    public final gf0 f36417b;

    public ff0(gf0 gf0Var, int i10) {
        this.f36416a = i10;
        this.f36417b = gf0Var;
    }

    @Override
    public final void run() {
        switch (this.f36416a) {
            case 0:
                gf0 gf0Var = this.f36417b;
                hf0 hf0Var = gf0Var.d;
                if (gf0Var.f36688b) {
                    boolean z10 = hf0Var.K;
                    org.telegram.ui.Components.xi0 xi0Var = hf0Var.J;
                    jd jdVar = hf0Var.f37012n;
                    if (z10 && System.currentTimeMillis() - gf0Var.f36687a >= 10000) {
                        jdVar.setAnimation(xi0Var);
                        xi0Var.L(0, false, false);
                        xi0Var.f32604u0 = new ff0(gf0Var, 1);
                        jdVar.d();
                        gf0Var.f36687a = System.currentTimeMillis();
                    }
                    jdVar.postDelayed(gf0Var.f36689c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ff0(this.f36417b, 2));
                return;
            default:
                hf0 hf0Var2 = this.f36417b.d;
                org.telegram.ui.Components.xi0 xi0Var2 = hf0Var2.I;
                xi0Var2.L(0, false, false);
                hf0Var2.f37012n.setAnimation(xi0Var2);
                return;
        }
    }
}
