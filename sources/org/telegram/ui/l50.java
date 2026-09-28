package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class l50 implements Runnable {
    public final int f35224a;
    public final m50 f35225b;

    public l50(m50 m50Var, int i10) {
        this.f35224a = i10;
        this.f35225b = m50Var;
    }

    @Override
    public final void run() {
        switch (this.f35224a) {
            case 0:
                m50 m50Var = this.f35225b;
                n50 n50Var = m50Var.f35483b;
                if (n50Var != null) {
                    n50Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new l50(m50Var, 2), 16L);
                return;
            case 1:
                n50 n50Var2 = this.f35225b.f35483b;
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
