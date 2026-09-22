package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class bw0 implements Runnable {
    public final int f32570a;
    public final mw0 f32571b;

    public bw0(mw0 mw0Var, int i10) {
        this.f32570a = i10;
        this.f32571b = mw0Var;
    }

    @Override
    public final void run() {
        switch (this.f32570a) {
            case 0:
                mw0 mw0Var = this.f32571b;
                AndroidUtilities.runOnUIThread(new bw0(mw0Var, 3));
                org.telegram.ui.Cells.u1 u1Var = mw0Var.L;
                if (u1Var != null) {
                    u1Var.setVisibility(0);
                    org.telegram.ui.Cells.u1 u1Var2 = mw0Var.L;
                    u1Var2.L7 = null;
                    u1Var2.invalidate();
                }
                wm wmVar = mw0Var.f35855e0;
                if (wmVar != null) {
                    AndroidUtilities.runOnUIThread(wmVar);
                    mw0Var.f35855e0 = null;
                    return;
                }
                return;
            case 1:
                this.f32571b.c(false);
                return;
            case 2:
                this.f32571b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public bw0(mw0 mw0Var, boolean z10) {
        this.f32570a = 0;
        this.f32571b = mw0Var;
    }
}
