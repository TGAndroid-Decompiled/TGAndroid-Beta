package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class hw0 implements Runnable {
    public final int f36975a;
    public final sw0 f36976b;

    public hw0(sw0 sw0Var, int i10) {
        this.f36975a = i10;
        this.f36976b = sw0Var;
    }

    @Override
    public final void run() {
        switch (this.f36975a) {
            case 0:
                sw0 sw0Var = this.f36976b;
                AndroidUtilities.runOnUIThread(new hw0(sw0Var, 3));
                org.telegram.ui.Cells.u1 u1Var = sw0Var.L;
                if (u1Var != null) {
                    u1Var.setVisibility(0);
                    org.telegram.ui.Cells.u1 u1Var2 = sw0Var.L;
                    u1Var2.L7 = null;
                    u1Var2.invalidate();
                }
                bn bnVar = sw0Var.f40235e0;
                if (bnVar != null) {
                    AndroidUtilities.runOnUIThread(bnVar);
                    sw0Var.f40235e0 = null;
                    return;
                }
                return;
            case 1:
                this.f36976b.c(false);
                return;
            case 2:
                this.f36976b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public hw0(sw0 sw0Var, boolean z10) {
        this.f36975a = 0;
        this.f36976b = sw0Var;
    }
}
