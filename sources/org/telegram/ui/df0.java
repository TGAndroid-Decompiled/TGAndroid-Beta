package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class df0 implements Runnable {
    public final int f37039a;
    public final ef0 f37040b;

    public df0(ef0 ef0Var, int i10) {
        this.f37039a = i10;
        this.f37040b = ef0Var;
    }

    @Override
    public final void run() {
        switch (this.f37039a) {
            case 0:
                ef0 ef0Var = this.f37040b;
                ff0 ff0Var = ef0Var.d;
                if (ef0Var.f37329b) {
                    boolean z10 = ff0Var.K;
                    org.telegram.ui.Components.dk0 dk0Var = ff0Var.J;
                    id idVar = ff0Var.f37701n;
                    if (z10 && System.currentTimeMillis() - ef0Var.f37328a >= 10000) {
                        idVar.setAnimation(dk0Var);
                        dk0Var.N(0, false, false);
                        dk0Var.f25829t0 = new df0(ef0Var, 1);
                        idVar.d();
                        ef0Var.f37328a = System.currentTimeMillis();
                    }
                    idVar.postDelayed(ef0Var.f37330c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new df0(this.f37040b, 2));
                return;
            default:
                ff0 ff0Var2 = this.f37040b.d;
                org.telegram.ui.Components.dk0 dk0Var2 = ff0Var2.I;
                dk0Var2.N(0, false, false);
                ff0Var2.f37701n.setAnimation(dk0Var2);
                return;
        }
    }
}
