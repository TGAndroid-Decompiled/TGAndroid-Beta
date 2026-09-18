package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class hf0 implements Runnable {
    public final int f34262a;
    public final if0 f34263b;

    public hf0(if0 if0Var, int i10) {
        this.f34262a = i10;
        this.f34263b = if0Var;
    }

    @Override
    public final void run() {
        switch (this.f34262a) {
            case 0:
                if0 if0Var = this.f34263b;
                jf0 jf0Var = if0Var.d;
                if (if0Var.f34560b) {
                    boolean z10 = jf0Var.K;
                    org.telegram.ui.Components.yi0 yi0Var = jf0Var.J;
                    kd kdVar = jf0Var.f34872n;
                    if (z10 && System.currentTimeMillis() - if0Var.f34559a >= 10000) {
                        kdVar.setAnimation(yi0Var);
                        yi0Var.N(0, false, false);
                        yi0Var.f30246t0 = new hf0(if0Var, 1);
                        kdVar.d();
                        if0Var.f34559a = System.currentTimeMillis();
                    }
                    kdVar.postDelayed(if0Var.f34561c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new hf0(this.f34263b, 2));
                return;
            default:
                jf0 jf0Var2 = this.f34263b.d;
                org.telegram.ui.Components.yi0 yi0Var2 = jf0Var2.I;
                yi0Var2.N(0, false, false);
                jf0Var2.f34872n.setAnimation(yi0Var2);
                return;
        }
    }
}
