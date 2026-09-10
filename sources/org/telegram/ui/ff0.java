package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ff0 implements Runnable {
    public final int f32806a;
    public final gf0 f32807b;

    public ff0(gf0 gf0Var, int i10) {
        this.f32806a = i10;
        this.f32807b = gf0Var;
    }

    @Override
    public final void run() {
        switch (this.f32806a) {
            case 0:
                gf0 gf0Var = this.f32807b;
                hf0 hf0Var = gf0Var.d;
                if (gf0Var.f33086b) {
                    boolean z10 = hf0Var.K;
                    org.telegram.ui.Components.hj0 hj0Var = hf0Var.J;
                    kd kdVar = hf0Var.f33376n;
                    if (z10 && System.currentTimeMillis() - gf0Var.f33085a >= 10000) {
                        kdVar.setAnimation(hj0Var);
                        hj0Var.N(0, false, false);
                        hj0Var.f23671u0 = new ff0(gf0Var, 1);
                        kdVar.d();
                        gf0Var.f33085a = System.currentTimeMillis();
                    }
                    kdVar.postDelayed(gf0Var.f33087c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ff0(this.f32807b, 2));
                return;
            default:
                hf0 hf0Var2 = this.f32807b.d;
                org.telegram.ui.Components.hj0 hj0Var2 = hf0Var2.I;
                hj0Var2.N(0, false, false);
                hf0Var2.f33376n.setAnimation(hj0Var2);
                return;
        }
    }
}
