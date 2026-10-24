package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class iv0 implements Runnable {
    public final int f38395a;
    public final tv0 f38396b;

    public iv0(tv0 tv0Var, int i10) {
        this.f38395a = i10;
        this.f38396b = tv0Var;
    }

    @Override
    public final void run() {
        switch (this.f38395a) {
            case 0:
                tv0 tv0Var = this.f38396b;
                AndroidUtilities.runOnUIThread(new iv0(tv0Var, 3));
                org.telegram.ui.Cells.t1 t1Var = tv0Var.L;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    org.telegram.ui.Cells.t1 t1Var2 = tv0Var.L;
                    t1Var2.L7 = null;
                    t1Var2.invalidate();
                }
                om omVar = tv0Var.f42130e0;
                if (omVar != null) {
                    AndroidUtilities.runOnUIThread(omVar);
                    tv0Var.f42130e0 = null;
                    return;
                }
                return;
            case 1:
                this.f38396b.c(false);
                return;
            case 2:
                this.f38396b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public iv0(tv0 tv0Var, boolean z10) {
        this.f38395a = 0;
        this.f38396b = tv0Var;
    }
}
