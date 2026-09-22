package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class hf0 implements Runnable {
    public final int f34206a;
    public final if0 f34207b;

    public hf0(if0 if0Var, int i10) {
        this.f34206a = i10;
        this.f34207b = if0Var;
    }

    @Override
    public final void run() {
        switch (this.f34206a) {
            case 0:
                if0 if0Var = this.f34207b;
                jf0 jf0Var = if0Var.d;
                if (if0Var.f34573b) {
                    boolean z10 = jf0Var.K;
                    org.telegram.ui.Components.kj0 kj0Var = jf0Var.J;
                    jd jdVar = jf0Var.f34941n;
                    if (z10 && System.currentTimeMillis() - if0Var.f34572a >= 10000) {
                        jdVar.setAnimation(kj0Var);
                        kj0Var.N(0, false, false);
                        kj0Var.f25735t0 = new hf0(if0Var, 1);
                        jdVar.d();
                        if0Var.f34572a = System.currentTimeMillis();
                    }
                    jdVar.postDelayed(if0Var.f34574c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new hf0(this.f34207b, 2));
                return;
            default:
                jf0 jf0Var2 = this.f34207b.d;
                org.telegram.ui.Components.kj0 kj0Var2 = jf0Var2.I;
                kj0Var2.N(0, false, false);
                jf0Var2.f34941n.setAnimation(kj0Var2);
                return;
        }
    }
}
