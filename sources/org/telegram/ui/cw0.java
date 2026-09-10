package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class cw0 implements Runnable {
    public final int f31782a;
    public final ow0 f31783b;

    public cw0(ow0 ow0Var, int i10) {
        this.f31782a = i10;
        this.f31783b = ow0Var;
    }

    @Override
    public final void run() {
        switch (this.f31782a) {
            case 0:
                ow0 ow0Var = this.f31783b;
                AndroidUtilities.runOnUIThread(new cw0(ow0Var, 3));
                org.telegram.ui.Cells.t1 t1Var = ow0Var.L;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    org.telegram.ui.Cells.t1 t1Var2 = ow0Var.L;
                    t1Var2.L7 = null;
                    t1Var2.invalidate();
                }
                an anVar = ow0Var.f35630e0;
                if (anVar != null) {
                    AndroidUtilities.runOnUIThread(anVar);
                    ow0Var.f35630e0 = null;
                    return;
                }
                return;
            case 1:
                this.f31783b.c(false);
                return;
            case 2:
                this.f31783b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public cw0(ow0 ow0Var, boolean z10) {
        this.f31782a = 0;
        this.f31783b = ow0Var;
    }
}
