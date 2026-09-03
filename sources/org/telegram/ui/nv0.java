package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class nv0 implements Runnable {
    public final int f36592a;
    public final yv0 f36593b;

    public nv0(yv0 yv0Var, int i10) {
        this.f36592a = i10;
        this.f36593b = yv0Var;
    }

    @Override
    public final void run() {
        switch (this.f36592a) {
            case 0:
                yv0 yv0Var = this.f36593b;
                AndroidUtilities.runOnUIThread(new nv0(yv0Var, 3));
                org.telegram.ui.Cells.s1 s1Var = yv0Var.I;
                if (s1Var != null) {
                    s1Var.setVisibility(0);
                    org.telegram.ui.Cells.s1 s1Var2 = yv0Var.I;
                    s1Var2.I7 = null;
                    s1Var2.invalidate();
                }
                wm wmVar = yv0Var.f40335b0;
                if (wmVar != null) {
                    AndroidUtilities.runOnUIThread(wmVar);
                    yv0Var.f40335b0 = null;
                    return;
                }
                return;
            case 1:
                this.f36593b.c(false);
                return;
            case 2:
                this.f36593b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public nv0(yv0 yv0Var, boolean z4) {
        this.f36592a = 0;
        this.f36593b = yv0Var;
    }
}
