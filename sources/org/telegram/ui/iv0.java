package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class iv0 implements Runnable {
    public final int f37988a;
    public final sv0 f37989b;

    public iv0(sv0 sv0Var, int i10) {
        this.f37988a = i10;
        this.f37989b = sv0Var;
    }

    @Override
    public final void run() {
        switch (this.f37988a) {
            case 0:
                sv0 sv0Var = this.f37989b;
                AndroidUtilities.runOnUIThread(new iv0(sv0Var, 3));
                org.telegram.ui.Cells.u1 u1Var = sv0Var.L;
                if (u1Var != null) {
                    u1Var.setVisibility(0);
                    org.telegram.ui.Cells.u1 u1Var2 = sv0Var.L;
                    u1Var2.L7 = null;
                    u1Var2.invalidate();
                }
                pm pmVar = sv0Var.f41513e0;
                if (pmVar != null) {
                    AndroidUtilities.runOnUIThread(pmVar);
                    sv0Var.f41513e0 = null;
                    return;
                }
                return;
            case 1:
                this.f37989b.c(false);
                return;
            case 2:
                this.f37989b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public iv0(sv0 sv0Var, boolean z10) {
        this.f37988a = 0;
        this.f37989b = sv0Var;
    }
}
