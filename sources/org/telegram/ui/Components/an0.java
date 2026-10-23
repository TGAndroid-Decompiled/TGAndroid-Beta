package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class an0 implements Runnable {
    public final int f24786a;
    public final cn0 f24787b;

    public an0(cn0 cn0Var, int i10) {
        this.f24786a = i10;
        this.f24787b = cn0Var;
    }

    @Override
    public final void run() {
        switch (this.f24786a) {
            case 0:
                cn0 cn0Var = this.f24787b;
                cn0Var.getClass();
                AndroidUtilities.runOnUIThread(new an0(cn0Var, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new an0(this.f24787b, 3));
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
