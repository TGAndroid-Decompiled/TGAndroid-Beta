package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class an0 implements Runnable {
    public final int f23582a;
    public final cn0 f23583b;

    public an0(cn0 cn0Var, int i10) {
        this.f23582a = i10;
        this.f23583b = cn0Var;
    }

    @Override
    public final void run() {
        switch (this.f23582a) {
            case 0:
                cn0 cn0Var = this.f23583b;
                cn0Var.getClass();
                AndroidUtilities.runOnUIThread(new an0(cn0Var, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new an0(this.f23583b, 3));
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
