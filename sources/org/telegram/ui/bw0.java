package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class bw0 implements Runnable {
    public final int f32591a;
    public final mw0 f32592b;

    public bw0(mw0 mw0Var, int i10) {
        this.f32591a = i10;
        this.f32592b = mw0Var;
    }

    @Override
    public final void run() {
        switch (this.f32591a) {
            case 0:
                mw0 mw0Var = this.f32592b;
                AndroidUtilities.runOnUIThread(new bw0(mw0Var, 3));
                org.telegram.ui.Cells.t1 t1Var = mw0Var.L;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    org.telegram.ui.Cells.t1 t1Var2 = mw0Var.L;
                    t1Var2.L7 = null;
                    t1Var2.invalidate();
                }
                ym ymVar = mw0Var.f35824e0;
                if (ymVar != null) {
                    AndroidUtilities.runOnUIThread(ymVar);
                    mw0Var.f35824e0 = null;
                    return;
                }
                return;
            case 1:
                this.f32592b.c(false);
                return;
            case 2:
                this.f32592b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public bw0(mw0 mw0Var, boolean z10) {
        this.f32591a = 0;
        this.f32592b = mw0Var;
    }
}
