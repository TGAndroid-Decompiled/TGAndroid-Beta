package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class dw0 implements Runnable {
    public final int f36924a;
    public final ow0 f36925b;

    public dw0(ow0 ow0Var, int i10) {
        this.f36924a = i10;
        this.f36925b = ow0Var;
    }

    @Override
    public final void run() {
        switch (this.f36924a) {
            case 0:
                ow0 ow0Var = this.f36925b;
                AndroidUtilities.runOnUIThread(new dw0(ow0Var, 3));
                org.telegram.ui.Cells.u1 u1Var = ow0Var.L;
                if (u1Var != null) {
                    u1Var.setVisibility(0);
                    org.telegram.ui.Cells.u1 u1Var2 = ow0Var.L;
                    u1Var2.L7 = null;
                    u1Var2.invalidate();
                }
                an anVar = ow0Var.f40796e0;
                if (anVar != null) {
                    AndroidUtilities.runOnUIThread(anVar);
                    ow0Var.f40796e0 = null;
                    return;
                }
                return;
            case 1:
                this.f36925b.c(false);
                return;
            case 2:
                this.f36925b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public dw0(ow0 ow0Var, boolean z10) {
        this.f36924a = 0;
        this.f36925b = ow0Var;
    }
}
