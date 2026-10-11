package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class df0 implements Runnable {
    public final int f37005a;
    public final ef0 f37006b;

    public df0(ef0 ef0Var, int i10) {
        this.f37005a = i10;
        this.f37006b = ef0Var;
    }

    @Override
    public final void run() {
        switch (this.f37005a) {
            case 0:
                ef0 ef0Var = this.f37006b;
                ff0 ff0Var = ef0Var.d;
                if (ef0Var.f37295b) {
                    boolean z10 = ff0Var.K;
                    org.telegram.ui.Components.ek0 ek0Var = ff0Var.J;
                    id idVar = ff0Var.f37667n;
                    if (z10 && System.currentTimeMillis() - ef0Var.f37294a >= 10000) {
                        idVar.setAnimation(ek0Var);
                        ek0Var.N(0, false, false);
                        ek0Var.f26062t0 = new df0(ef0Var, 1);
                        idVar.d();
                        ef0Var.f37294a = System.currentTimeMillis();
                    }
                    idVar.postDelayed(ef0Var.f37296c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new df0(this.f37006b, 2));
                return;
            default:
                ff0 ff0Var2 = this.f37006b.d;
                org.telegram.ui.Components.ek0 ek0Var2 = ff0Var2.I;
                ek0Var2.N(0, false, false);
                ff0Var2.f37667n.setAnimation(ek0Var2);
                return;
        }
    }
}
