package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class nv0 implements Runnable {
    public final int f39465a;
    public final yv0 f39466b;

    public nv0(yv0 yv0Var, int i10) {
        this.f39465a = i10;
        this.f39466b = yv0Var;
    }

    @Override
    public final void run() {
        switch (this.f39465a) {
            case 0:
                yv0 yv0Var = this.f39466b;
                AndroidUtilities.runOnUIThread(new nv0(yv0Var, 3));
                org.telegram.ui.Cells.t1 t1Var = yv0Var.I;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    org.telegram.ui.Cells.t1 t1Var2 = yv0Var.I;
                    t1Var2.I7 = null;
                    t1Var2.invalidate();
                }
                um umVar = yv0Var.f43709b0;
                if (umVar != null) {
                    AndroidUtilities.runOnUIThread(umVar);
                    yv0Var.f43709b0 = null;
                    return;
                }
                return;
            case 1:
                this.f39466b.c(false);
                return;
            case 2:
                this.f39466b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public nv0(yv0 yv0Var, boolean z4) {
        this.f39465a = 0;
        this.f39466b = yv0Var;
    }
}
