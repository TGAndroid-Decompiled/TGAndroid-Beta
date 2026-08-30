package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class l50 implements Runnable {
    public final int f35959a;
    public final m50 f35960b;

    public l50(m50 m50Var, int i10) {
        this.f35959a = i10;
        this.f35960b = m50Var;
    }

    @Override
    public final void run() {
        switch (this.f35959a) {
            case 0:
                m50 m50Var = this.f35960b;
                eg.h0 h0Var = m50Var.f36191b;
                if (h0Var != null) {
                    h0Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new l50(m50Var, 2), 16L);
                return;
            case 1:
                eg.h0 h0Var2 = this.f35960b.f36191b;
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
