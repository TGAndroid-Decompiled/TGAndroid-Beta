package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class n50 implements Runnable {
    public final int f36389a;
    public final o50 f36390b;

    public n50(o50 o50Var, int i10) {
        this.f36389a = i10;
        this.f36390b = o50Var;
    }

    @Override
    public final void run() {
        switch (this.f36389a) {
            case 0:
                o50 o50Var = this.f36390b;
                eg.h0 h0Var = o50Var.f36651b;
                if (h0Var != null) {
                    h0Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new n50(o50Var, 2), 16L);
                return;
            case 1:
                eg.h0 h0Var2 = this.f36390b.f36651b;
                if (h0Var2 != null) {
                    h0Var2.setVisibility(4);
                    return;
                }
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
