package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class nv0 implements Runnable {
    public final int f42006a;
    public final xv0 f42007b;

    public nv0(xv0 xv0Var, int i10) {
        this.f42006a = i10;
        this.f42007b = xv0Var;
    }

    @Override
    public final void run() {
        switch (this.f42006a) {
            case 0:
                xv0 xv0Var = this.f42007b;
                AndroidUtilities.runOnUIThread(new nv0(xv0Var, 3));
                org.telegram.ui.Cells.s1 s1Var = xv0Var.L;
                if (s1Var != null) {
                    s1Var.setVisibility(0);
                    org.telegram.ui.Cells.s1 s1Var2 = xv0Var.L;
                    s1Var2.L7 = null;
                    s1Var2.invalidate();
                }
                qm qmVar = xv0Var.f45875e0;
                if (qmVar != null) {
                    AndroidUtilities.runOnUIThread(qmVar);
                    xv0Var.f45875e0 = null;
                    return;
                }
                return;
            case 1:
                this.f42007b.c(false);
                return;
            case 2:
                this.f42007b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public nv0(xv0 xv0Var, boolean z10) {
        this.f42006a = 0;
        this.f42007b = xv0Var;
    }
}
