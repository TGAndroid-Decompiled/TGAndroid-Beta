package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class m50 implements Runnable {
    public final int f38855a;
    public final n50 f38856b;

    public m50(n50 n50Var, int i10) {
        this.f38855a = i10;
        this.f38856b = n50Var;
    }

    @Override
    public final void run() {
        switch (this.f38855a) {
            case 0:
                n50 n50Var = this.f38856b;
                fg.h0 h0Var = n50Var.f39184b;
                if (h0Var != null) {
                    h0Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new m50(n50Var, 2), 16L);
                return;
            case 1:
                fg.h0 h0Var2 = this.f38856b.f39184b;
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
