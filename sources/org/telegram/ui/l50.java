package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class l50 implements Runnable {
    public final int f35223a;
    public final m50 f35224b;

    public l50(m50 m50Var, int i10) {
        this.f35223a = i10;
        this.f35224b = m50Var;
    }

    @Override
    public final void run() {
        switch (this.f35223a) {
            case 0:
                m50 m50Var = this.f35224b;
                n50 n50Var = m50Var.f35482b;
                if (n50Var != null) {
                    n50Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new l50(m50Var, 2), 16L);
                return;
            case 1:
                n50 n50Var2 = this.f35224b.f35482b;
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
