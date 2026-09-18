package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class zl0 implements Runnable {
    public final int f30542a;
    public final bm0 f30543b;

    public zl0(bm0 bm0Var, int i10) {
        this.f30542a = i10;
        this.f30543b = bm0Var;
    }

    @Override
    public final void run() {
        switch (this.f30542a) {
            case 0:
                bm0 bm0Var = this.f30543b;
                bm0Var.getClass();
                AndroidUtilities.runOnUIThread(new zl0(bm0Var, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new zl0(this.f30543b, 3));
                return;
            case 2:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
