package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class dw0 implements Runnable {
    public final int f33229a;
    public final ow0 f33230b;

    public dw0(ow0 ow0Var, int i10) {
        this.f33229a = i10;
        this.f33230b = ow0Var;
    }

    @Override
    public final void run() {
        switch (this.f33229a) {
            case 0:
                ow0 ow0Var = this.f33230b;
                AndroidUtilities.runOnUIThread(new dw0(ow0Var, 3));
                org.telegram.ui.Cells.t1 t1Var = ow0Var.L;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    org.telegram.ui.Cells.t1 t1Var2 = ow0Var.L;
                    t1Var2.L7 = null;
                    t1Var2.invalidate();
                }
                ym ymVar = ow0Var.f36442e0;
                if (ymVar != null) {
                    AndroidUtilities.runOnUIThread(ymVar);
                    ow0Var.f36442e0 = null;
                    return;
                }
                return;
            case 1:
                this.f33230b.c(false);
                return;
            case 2:
                this.f33230b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public dw0(ow0 ow0Var, boolean z10) {
        this.f33229a = 0;
        this.f33230b = ow0Var;
    }
}
