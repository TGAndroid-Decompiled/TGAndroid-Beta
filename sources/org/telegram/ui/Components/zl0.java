package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class zl0 implements Runnable {
    public final int f30618a;
    public final bm0 f30619b;

    public zl0(bm0 bm0Var, int i10) {
        this.f30618a = i10;
        this.f30619b = bm0Var;
    }

    @Override
    public final void run() {
        switch (this.f30618a) {
            case 0:
                bm0 bm0Var = this.f30619b;
                bm0Var.getClass();
                AndroidUtilities.runOnUIThread(new zl0(bm0Var, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new zl0(this.f30619b, 3));
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
