package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class gf0 implements Runnable {
    public final int f33829a;
    public final hf0 f33830b;

    public gf0(hf0 hf0Var, int i10) {
        this.f33829a = i10;
        this.f33830b = hf0Var;
    }

    @Override
    public final void run() {
        switch (this.f33829a) {
            case 0:
                hf0 hf0Var = this.f33830b;
                if0 if0Var = hf0Var.d;
                if (hf0Var.f34150b) {
                    boolean z10 = if0Var.K;
                    org.telegram.ui.Components.ij0 ij0Var = if0Var.J;
                    jd jdVar = if0Var.f34515n;
                    if (z10 && System.currentTimeMillis() - hf0Var.f34149a >= 10000) {
                        jdVar.setAnimation(ij0Var);
                        ij0Var.N(0, false, false);
                        ij0Var.f24996t0 = new gf0(hf0Var, 1);
                        jdVar.d();
                        hf0Var.f34149a = System.currentTimeMillis();
                    }
                    jdVar.postDelayed(hf0Var.f34151c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new gf0(this.f33830b, 2));
                return;
            default:
                if0 if0Var2 = this.f33830b.d;
                org.telegram.ui.Components.ij0 ij0Var2 = if0Var2.I;
                ij0Var2.N(0, false, false);
                if0Var2.f34515n.setAnimation(ij0Var2);
                return;
        }
    }
}
