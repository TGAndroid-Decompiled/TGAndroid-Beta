package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class q50 implements Runnable {
    public final int f41191a;
    public final r50 f41192b;

    public q50(r50 r50Var, int i10) {
        this.f41191a = i10;
        this.f41192b = r50Var;
    }

    @Override
    public final void run() {
        switch (this.f41191a) {
            case 0:
                r50 r50Var = this.f41192b;
                s50 s50Var = r50Var.f41506b;
                if (s50Var != null) {
                    s50Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new q50(r50Var, 2), 16L);
                return;
            case 1:
                s50 s50Var2 = this.f41192b.f41506b;
                if (s50Var2 != null) {
                    s50Var2.setVisibility(4);
                    return;
                }
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
