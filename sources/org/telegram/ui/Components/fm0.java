package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class fm0 implements Runnable {
    public final int f24916a;
    public final hm0 f24917b;

    public fm0(hm0 hm0Var, int i10) {
        this.f24916a = i10;
        this.f24917b = hm0Var;
    }

    @Override
    public final void run() {
        switch (this.f24916a) {
            case 0:
                hm0 hm0Var = this.f24917b;
                hm0Var.getClass();
                AndroidUtilities.runOnUIThread(new fm0(hm0Var, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new fm0(this.f24917b, 3));
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
