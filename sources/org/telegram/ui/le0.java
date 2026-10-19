package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class le0 implements Runnable {
    public final int f38900a;
    public final me0 f38901b;

    public le0(me0 me0Var, int i10) {
        this.f38900a = i10;
        this.f38901b = me0Var;
    }

    @Override
    public final void run() {
        switch (this.f38900a) {
            case 0:
                me0 me0Var = this.f38901b;
                ne0 ne0Var = me0Var.d;
                if (me0Var.f39253b) {
                    boolean z10 = ne0Var.K;
                    org.telegram.ui.Components.uj0 uj0Var = ne0Var.J;
                    jd jdVar = ne0Var.f39555n;
                    if (z10 && System.currentTimeMillis() - me0Var.f39252a >= 10000) {
                        jdVar.setAnimation(uj0Var);
                        uj0Var.N(0, false, false);
                        uj0Var.f31000t0 = new le0(me0Var, 1);
                        jdVar.d();
                        me0Var.f39252a = System.currentTimeMillis();
                    }
                    jdVar.postDelayed(me0Var.f39254c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new le0(this.f38901b, 2));
                return;
            default:
                ne0 ne0Var2 = this.f38901b.d;
                org.telegram.ui.Components.uj0 uj0Var2 = ne0Var2.I;
                uj0Var2.N(0, false, false);
                ne0Var2.f39555n.setAnimation(uj0Var2);
                return;
        }
    }
}
