package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class an0 implements Runnable {
    public final int f23272a;
    public final cn0 f23273b;

    public an0(cn0 cn0Var, int i10) {
        this.f23272a = i10;
        this.f23273b = cn0Var;
    }

    @Override
    public final void run() {
        switch (this.f23272a) {
            case 0:
                cn0 cn0Var = this.f23273b;
                cn0Var.getClass();
                AndroidUtilities.runOnUIThread(new an0(cn0Var, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new an0(this.f23273b, 3));
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
