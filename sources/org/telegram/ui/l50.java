package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class l50 implements Runnable {
    public final int f35206a;
    public final m50 f35207b;

    public l50(m50 m50Var, int i10) {
        this.f35206a = i10;
        this.f35207b = m50Var;
    }

    @Override
    public final void run() {
        switch (this.f35206a) {
            case 0:
                m50 m50Var = this.f35207b;
                n50 n50Var = m50Var.f35485b;
                if (n50Var != null) {
                    n50Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new l50(m50Var, 2), 16L);
                return;
            case 1:
                n50 n50Var2 = this.f35207b.f35485b;
                if (n50Var2 != null) {
                    n50Var2.setVisibility(4);
                    return;
                }
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
