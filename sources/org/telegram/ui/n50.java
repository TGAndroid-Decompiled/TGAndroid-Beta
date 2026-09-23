package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class n50 implements Runnable {
    public final int f35438a;
    public final o50 f35439b;

    public n50(o50 o50Var, int i10) {
        this.f35438a = i10;
        this.f35439b = o50Var;
    }

    @Override
    public final void run() {
        switch (this.f35438a) {
            case 0:
                o50 o50Var = this.f35439b;
                p50 p50Var = o50Var.f35684b;
                if (p50Var != null) {
                    p50Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new n50(o50Var, 2), 16L);
                return;
            case 1:
                p50 p50Var2 = this.f35439b.f35684b;
                if (p50Var2 != null) {
                    p50Var2.setVisibility(4);
                    return;
                }
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
