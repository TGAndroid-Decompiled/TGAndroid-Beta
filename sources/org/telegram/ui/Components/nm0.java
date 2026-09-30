package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class nm0 implements Runnable {
    public final int f26738a;
    public final pm0 f26739b;

    public nm0(pm0 pm0Var, int i10) {
        this.f26738a = i10;
        this.f26739b = pm0Var;
    }

    @Override
    public final void run() {
        switch (this.f26738a) {
            case 0:
                pm0 pm0Var = this.f26739b;
                pm0Var.getClass();
                AndroidUtilities.runOnUIThread(new nm0(pm0Var, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new nm0(this.f26739b, 3));
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
