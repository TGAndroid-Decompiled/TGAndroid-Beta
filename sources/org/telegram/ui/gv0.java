package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class gv0 implements Runnable {
    public final int f34689a;
    public final rv0 f34690b;

    public gv0(rv0 rv0Var, int i10) {
        this.f34689a = i10;
        this.f34690b = rv0Var;
    }

    @Override
    public final void run() {
        switch (this.f34689a) {
            case 0:
                rv0 rv0Var = this.f34690b;
                AndroidUtilities.runOnUIThread(new gv0(rv0Var, 3));
                org.telegram.ui.Cells.t1 t1Var = rv0Var.I;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    org.telegram.ui.Cells.t1 t1Var2 = rv0Var.I;
                    t1Var2.I7 = null;
                    t1Var2.invalidate();
                }
                um umVar = rv0Var.f38120b0;
                if (umVar != null) {
                    AndroidUtilities.runOnUIThread(umVar);
                    rv0Var.f38120b0 = null;
                    return;
                }
                return;
            case 1:
                this.f34690b.c(false);
                return;
            case 2:
                this.f34690b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public gv0(rv0 rv0Var, boolean z4) {
        this.f34689a = 0;
        this.f34690b = rv0Var;
    }
}
