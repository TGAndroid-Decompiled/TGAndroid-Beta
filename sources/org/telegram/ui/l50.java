package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class l50 implements Runnable {
    public final int f35191a;
    public final m50 f35192b;

    public l50(m50 m50Var, int i10) {
        this.f35191a = i10;
        this.f35192b = m50Var;
    }

    @Override
    public final void run() {
        switch (this.f35191a) {
            case 0:
                m50 m50Var = this.f35192b;
                n50 n50Var = m50Var.f35469b;
                if (n50Var != null) {
                    n50Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new l50(m50Var, 2), 16L);
                return;
            case 1:
                n50 n50Var2 = this.f35192b.f35469b;
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
