package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class le0 implements Runnable {
    public final int f38908a;
    public final me0 f38909b;

    public le0(me0 me0Var, int i10) {
        this.f38908a = i10;
        this.f38909b = me0Var;
    }

    @Override
    public final void run() {
        switch (this.f38908a) {
            case 0:
                me0 me0Var = this.f38909b;
                ne0 ne0Var = me0Var.d;
                if (me0Var.f39228b) {
                    boolean z10 = ne0Var.K;
                    org.telegram.ui.Components.vj0 vj0Var = ne0Var.J;
                    jd jdVar = ne0Var.f39560n;
                    if (z10 && System.currentTimeMillis() - me0Var.f39227a >= 10000) {
                        jdVar.setAnimation(vj0Var);
                        vj0Var.N(0, false, false);
                        vj0Var.f31292t0 = new le0(me0Var, 1);
                        jdVar.d();
                        me0Var.f39227a = System.currentTimeMillis();
                    }
                    jdVar.postDelayed(me0Var.f39229c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new le0(this.f38909b, 2));
                return;
            default:
                ne0 ne0Var2 = this.f38909b.d;
                org.telegram.ui.Components.vj0 vj0Var2 = ne0Var2.I;
                vj0Var2.N(0, false, false);
                ne0Var2.f39560n.setAnimation(vj0Var2);
                return;
        }
    }
}
