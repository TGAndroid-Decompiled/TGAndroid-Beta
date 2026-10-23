package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class jv0 implements Runnable {
    public final int f38712a;
    public final uv0 f38713b;

    public jv0(uv0 uv0Var, int i10) {
        this.f38712a = i10;
        this.f38713b = uv0Var;
    }

    @Override
    public final void run() {
        switch (this.f38712a) {
            case 0:
                uv0 uv0Var = this.f38713b;
                AndroidUtilities.runOnUIThread(new jv0(uv0Var, 3));
                org.telegram.ui.Cells.t1 t1Var = uv0Var.L;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    org.telegram.ui.Cells.t1 t1Var2 = uv0Var.L;
                    t1Var2.L7 = null;
                    t1Var2.invalidate();
                }
                om omVar = uv0Var.f42521e0;
                if (omVar != null) {
                    AndroidUtilities.runOnUIThread(omVar);
                    uv0Var.f42521e0 = null;
                    return;
                }
                return;
            case 1:
                this.f38713b.c(false);
                return;
            case 2:
                this.f38713b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public jv0(uv0 uv0Var, boolean z10) {
        this.f38712a = 0;
        this.f38713b = uv0Var;
    }
}
