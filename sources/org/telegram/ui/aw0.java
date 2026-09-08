package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class aw0 implements Runnable {
    public final int f34586a;
    public final lw0 f34587b;

    public aw0(lw0 lw0Var, int i10) {
        this.f34586a = i10;
        this.f34587b = lw0Var;
    }

    @Override
    public final void run() {
        switch (this.f34586a) {
            case 0:
                lw0 lw0Var = this.f34587b;
                AndroidUtilities.runOnUIThread(new aw0(lw0Var, 3));
                org.telegram.ui.Cells.t1 t1Var = lw0Var.L;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    org.telegram.ui.Cells.t1 t1Var2 = lw0Var.L;
                    t1Var2.L7 = null;
                    t1Var2.invalidate();
                }
                zm zmVar = lw0Var.f38525e0;
                if (zmVar != null) {
                    AndroidUtilities.runOnUIThread(zmVar);
                    lw0Var.f38525e0 = null;
                    return;
                }
                return;
            case 1:
                this.f34587b.c(false);
                return;
            case 2:
                this.f34587b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public aw0(lw0 lw0Var, boolean z10) {
        this.f34586a = 0;
        this.f34587b = lw0Var;
    }
}
