package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class le0 implements Runnable {
    public final int f38905a;
    public final me0 f38906b;

    public le0(me0 me0Var, int i10) {
        this.f38905a = i10;
        this.f38906b = me0Var;
    }

    @Override
    public final void run() {
        switch (this.f38905a) {
            case 0:
                me0 me0Var = this.f38906b;
                ne0 ne0Var = me0Var.d;
                if (me0Var.f39225b) {
                    boolean z10 = ne0Var.K;
                    org.telegram.ui.Components.vj0 vj0Var = ne0Var.J;
                    jd jdVar = ne0Var.f39557n;
                    if (z10 && System.currentTimeMillis() - me0Var.f39224a >= 10000) {
                        jdVar.setAnimation(vj0Var);
                        vj0Var.N(0, false, false);
                        vj0Var.f31289t0 = new le0(me0Var, 1);
                        jdVar.d();
                        me0Var.f39224a = System.currentTimeMillis();
                    }
                    jdVar.postDelayed(me0Var.f39226c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new le0(this.f38906b, 2));
                return;
            default:
                ne0 ne0Var2 = this.f38906b.d;
                org.telegram.ui.Components.vj0 vj0Var2 = ne0Var2.I;
                vj0Var2.N(0, false, false);
                ne0Var2.f39557n.setAnimation(vj0Var2);
                return;
        }
    }
}
