package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ff0 implements Runnable {
    public final int f37763a;
    public final gf0 f37764b;

    public ff0(gf0 gf0Var, int i10) {
        this.f37763a = i10;
        this.f37764b = gf0Var;
    }

    @Override
    public final void run() {
        switch (this.f37763a) {
            case 0:
                gf0 gf0Var = this.f37764b;
                hf0 hf0Var = gf0Var.d;
                if (gf0Var.f38035b) {
                    boolean z10 = hf0Var.K;
                    org.telegram.ui.Components.fk0 fk0Var = hf0Var.J;
                    nd ndVar = hf0Var.f38358n;
                    if (z10 && System.currentTimeMillis() - gf0Var.f38034a >= 10000) {
                        ndVar.setAnimation(fk0Var);
                        fk0Var.N(0, false, false);
                        fk0Var.f26126t0 = new ff0(gf0Var, 1);
                        ndVar.d();
                        gf0Var.f38034a = System.currentTimeMillis();
                    }
                    ndVar.postDelayed(gf0Var.f38036c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ff0(this.f37764b, 2));
                return;
            default:
                hf0 hf0Var2 = this.f37764b.d;
                org.telegram.ui.Components.fk0 fk0Var2 = hf0Var2.I;
                fk0Var2.N(0, false, false);
                hf0Var2.f38358n.setAnimation(fk0Var2);
                return;
        }
    }
}
