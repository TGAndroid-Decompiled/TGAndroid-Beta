package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class gw0 implements Runnable {
    public final int f36322a;
    public final rw0 f36323b;

    public gw0(rw0 rw0Var, int i10) {
        this.f36322a = i10;
        this.f36323b = rw0Var;
    }

    @Override
    public final void run() {
        switch (this.f36322a) {
            case 0:
                rw0 rw0Var = this.f36323b;
                AndroidUtilities.runOnUIThread(new gw0(rw0Var, 3));
                org.telegram.ui.Cells.u1 u1Var = rw0Var.L;
                if (u1Var != null) {
                    u1Var.setVisibility(0);
                    org.telegram.ui.Cells.u1 u1Var2 = rw0Var.L;
                    u1Var2.L7 = null;
                    u1Var2.invalidate();
                }
                bn bnVar = rw0Var.f39605e0;
                if (bnVar != null) {
                    AndroidUtilities.runOnUIThread(bnVar);
                    rw0Var.f39605e0 = null;
                    return;
                }
                return;
            case 1:
                this.f36323b.c(false);
                return;
            case 2:
                this.f36323b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public gw0(rw0 rw0Var, boolean z10) {
        this.f36322a = 0;
        this.f36323b = rw0Var;
    }
}
