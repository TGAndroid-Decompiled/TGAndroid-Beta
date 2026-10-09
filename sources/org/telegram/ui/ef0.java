package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ef0 implements Runnable {
    public final int f37251a;
    public final ff0 f37252b;

    public ef0(ff0 ff0Var, int i10) {
        this.f37251a = i10;
        this.f37252b = ff0Var;
    }

    @Override
    public final void run() {
        switch (this.f37251a) {
            case 0:
                ff0 ff0Var = this.f37252b;
                gf0 gf0Var = ff0Var.d;
                if (ff0Var.f37542b) {
                    boolean z10 = gf0Var.K;
                    org.telegram.ui.Components.ck0 ck0Var = gf0Var.J;
                    jd jdVar = gf0Var.f38005n;
                    if (z10 && System.currentTimeMillis() - ff0Var.f37541a >= 10000) {
                        jdVar.setAnimation(ck0Var);
                        ck0Var.N(0, false, false);
                        ck0Var.f25420t0 = new ef0(ff0Var, 1);
                        jdVar.d();
                        ff0Var.f37541a = System.currentTimeMillis();
                    }
                    jdVar.postDelayed(ff0Var.f37543c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ef0(this.f37252b, 2));
                return;
            default:
                gf0 gf0Var2 = this.f37252b.d;
                org.telegram.ui.Components.ck0 ck0Var2 = gf0Var2.I;
                ck0Var2.N(0, false, false);
                gf0Var2.f38005n.setAnimation(ck0Var2);
                return;
        }
    }
}
