package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class yl0 implements Runnable {
    public final int f30278a;
    public final am0 f30279b;

    public yl0(am0 am0Var, int i10) {
        this.f30278a = i10;
        this.f30279b = am0Var;
    }

    @Override
    public final void run() {
        switch (this.f30278a) {
            case 0:
                am0 am0Var = this.f30279b;
                am0Var.getClass();
                AndroidUtilities.runOnUIThread(new yl0(am0Var, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new yl0(this.f30279b, 3));
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
