package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class aw0 implements Runnable {
    public final int f36228a;
    public final lw0 f36229b;

    public aw0(lw0 lw0Var, int i10) {
        this.f36228a = i10;
        this.f36229b = lw0Var;
    }

    @Override
    public final void run() {
        switch (this.f36228a) {
            case 0:
                lw0 lw0Var = this.f36229b;
                AndroidUtilities.runOnUIThread(new aw0(lw0Var, 3));
                org.telegram.ui.Cells.u1 u1Var = lw0Var.L;
                if (u1Var != null) {
                    u1Var.setVisibility(0);
                    org.telegram.ui.Cells.u1 u1Var2 = lw0Var.L;
                    u1Var2.L7 = null;
                    u1Var2.invalidate();
                }
                wm wmVar = lw0Var.f39787e0;
                if (wmVar != null) {
                    AndroidUtilities.runOnUIThread(wmVar);
                    lw0Var.f39787e0 = null;
                    return;
                }
                return;
            case 1:
                this.f36229b.c(false);
                return;
            case 2:
                this.f36229b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public aw0(lw0 lw0Var, boolean z10) {
        this.f36228a = 0;
        this.f36229b = lw0Var;
    }
}
