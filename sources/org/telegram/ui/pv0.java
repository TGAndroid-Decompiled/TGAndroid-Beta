package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class pv0 implements Runnable {
    public final int f42512a;
    public final zv0 f42513b;

    public pv0(zv0 zv0Var, int i10) {
        this.f42512a = i10;
        this.f42513b = zv0Var;
    }

    @Override
    public final void run() {
        switch (this.f42512a) {
            case 0:
                zv0 zv0Var = this.f42513b;
                AndroidUtilities.runOnUIThread(new pv0(zv0Var, 3));
                org.telegram.ui.Cells.s1 s1Var = zv0Var.L;
                if (s1Var != null) {
                    s1Var.setVisibility(0);
                    org.telegram.ui.Cells.s1 s1Var2 = zv0Var.L;
                    s1Var2.L7 = null;
                    s1Var2.invalidate();
                }
                sm smVar = zv0Var.f46382e0;
                if (smVar != null) {
                    AndroidUtilities.runOnUIThread(smVar);
                    zv0Var.f46382e0 = null;
                    return;
                }
                return;
            case 1:
                this.f42513b.c(false);
                return;
            case 2:
                this.f42513b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public pv0(zv0 zv0Var, boolean z10) {
        this.f42512a = 0;
        this.f42513b = zv0Var;
    }
}
