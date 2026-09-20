package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class hf0 implements Runnable {
    public final int f34190a;
    public final if0 f34191b;

    public hf0(if0 if0Var, int i10) {
        this.f34190a = i10;
        this.f34191b = if0Var;
    }

    @Override
    public final void run() {
        switch (this.f34190a) {
            case 0:
                if0 if0Var = this.f34191b;
                jf0 jf0Var = if0Var.d;
                if (if0Var.f34553b) {
                    boolean z10 = jf0Var.K;
                    org.telegram.ui.Components.hj0 hj0Var = jf0Var.J;
                    jd jdVar = jf0Var.f34916n;
                    if (z10 && System.currentTimeMillis() - if0Var.f34552a >= 10000) {
                        jdVar.setAnimation(hj0Var);
                        hj0Var.N(0, false, false);
                        hj0Var.f24702t0 = new hf0(if0Var, 1);
                        jdVar.d();
                        if0Var.f34552a = System.currentTimeMillis();
                    }
                    jdVar.postDelayed(if0Var.f34554c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new hf0(this.f34191b, 2));
                return;
            default:
                jf0 jf0Var2 = this.f34191b.d;
                org.telegram.ui.Components.hj0 hj0Var2 = jf0Var2.I;
                hj0Var2.N(0, false, false);
                jf0Var2.f34916n.setAnimation(hj0Var2);
                return;
        }
    }
}
