package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class wl0 implements Runnable {
    public final int f34438a;
    public final yl0 f34439b;

    public wl0(yl0 yl0Var, int i10) {
        this.f34438a = i10;
        this.f34439b = yl0Var;
    }

    @Override
    public final void run() {
        switch (this.f34438a) {
            case 0:
                yl0 yl0Var = this.f34439b;
                yl0Var.getClass();
                AndroidUtilities.runOnUIThread(new wl0(yl0Var, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new wl0(this.f34439b, 3));
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
