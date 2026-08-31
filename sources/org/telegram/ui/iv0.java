package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class iv0 implements Runnable {
    public final int f37938a;
    public final tv0 f37939b;

    public iv0(tv0 tv0Var, int i10) {
        this.f37938a = i10;
        this.f37939b = tv0Var;
    }

    @Override
    public final void run() {
        switch (this.f37938a) {
            case 0:
                tv0 tv0Var = this.f37939b;
                AndroidUtilities.runOnUIThread(new iv0(tv0Var, 3));
                org.telegram.ui.Cells.t1 t1Var = tv0Var.I;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    org.telegram.ui.Cells.t1 t1Var2 = tv0Var.I;
                    t1Var2.I7 = null;
                    t1Var2.invalidate();
                }
                um umVar = tv0Var.f41716b0;
                if (umVar != null) {
                    AndroidUtilities.runOnUIThread(umVar);
                    tv0Var.f41716b0 = null;
                    return;
                }
                return;
            case 1:
                this.f37939b.c(false);
                return;
            case 2:
                this.f37939b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public iv0(tv0 tv0Var, boolean z4) {
        this.f37938a = 0;
        this.f37939b = tv0Var;
    }
}
