package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ef0 implements Runnable {
    public final int f37249a;
    public final ff0 f37250b;

    public ef0(ff0 ff0Var, int i10) {
        this.f37249a = i10;
        this.f37250b = ff0Var;
    }

    @Override
    public final void run() {
        switch (this.f37249a) {
            case 0:
                ff0 ff0Var = this.f37250b;
                gf0 gf0Var = ff0Var.d;
                if (ff0Var.f37540b) {
                    boolean z10 = gf0Var.K;
                    org.telegram.ui.Components.ck0 ck0Var = gf0Var.J;
                    jd jdVar = gf0Var.f38003n;
                    if (z10 && System.currentTimeMillis() - ff0Var.f37539a >= 10000) {
                        jdVar.setAnimation(ck0Var);
                        ck0Var.N(0, false, false);
                        ck0Var.f25420t0 = new ef0(ff0Var, 1);
                        jdVar.d();
                        ff0Var.f37539a = System.currentTimeMillis();
                    }
                    jdVar.postDelayed(ff0Var.f37541c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ef0(this.f37250b, 2));
                return;
            default:
                gf0 gf0Var2 = this.f37250b.d;
                org.telegram.ui.Components.ck0 ck0Var2 = gf0Var2.I;
                ck0Var2.N(0, false, false);
                gf0Var2.f38003n.setAnimation(ck0Var2);
                return;
        }
    }
}
