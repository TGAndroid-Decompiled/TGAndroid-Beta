package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class q50 implements Runnable {
    public final int f39629a;
    public final r50 f39630b;

    public q50(r50 r50Var, int i10) {
        this.f39629a = i10;
        this.f39630b = r50Var;
    }

    @Override
    public final void run() {
        switch (this.f39629a) {
            case 0:
                r50 r50Var = this.f39630b;
                n20 n20Var = r50Var.f39920b;
                if (n20Var != null) {
                    n20Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new q50(r50Var, 2), 16L);
                return;
            case 1:
                n20 n20Var2 = this.f39630b.f39920b;
                if (n20Var2 != null) {
                    n20Var2.setVisibility(4);
                    return;
                }
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
