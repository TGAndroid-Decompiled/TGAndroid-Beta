package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class gv0 implements Runnable {
    public final int f37426a;
    public final qv0 f37427b;

    public gv0(qv0 qv0Var, int i10) {
        this.f37426a = i10;
        this.f37427b = qv0Var;
    }

    @Override
    public final void run() {
        switch (this.f37426a) {
            case 0:
                qv0 qv0Var = this.f37427b;
                AndroidUtilities.runOnUIThread(new gv0(qv0Var, 3));
                org.telegram.ui.Cells.u1 u1Var = qv0Var.L;
                if (u1Var != null) {
                    u1Var.setVisibility(0);
                    org.telegram.ui.Cells.u1 u1Var2 = qv0Var.L;
                    u1Var2.L7 = null;
                    u1Var2.invalidate();
                }
                nm nmVar = qv0Var.f40986e0;
                if (nmVar != null) {
                    AndroidUtilities.runOnUIThread(nmVar);
                    qv0Var.f40986e0 = null;
                    return;
                }
                return;
            case 1:
                this.f37427b.c(false);
                return;
            case 2:
                this.f37427b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public gv0(qv0 qv0Var, boolean z10) {
        this.f37426a = 0;
        this.f37427b = qv0Var;
    }
}
