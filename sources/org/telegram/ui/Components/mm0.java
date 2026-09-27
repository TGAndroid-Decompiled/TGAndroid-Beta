package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class mm0 implements Runnable {
    public final int f26472a;
    public final om0 f26473b;

    public mm0(om0 om0Var, int i10) {
        this.f26472a = i10;
        this.f26473b = om0Var;
    }

    @Override
    public final void run() {
        switch (this.f26472a) {
            case 0:
                om0 om0Var = this.f26473b;
                om0Var.getClass();
                AndroidUtilities.runOnUIThread(new mm0(om0Var, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new mm0(this.f26473b, 3));
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
