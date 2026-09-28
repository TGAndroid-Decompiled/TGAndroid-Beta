package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class mm0 implements Runnable {
    public final int f26453a;
    public final om0 f26454b;

    public mm0(om0 om0Var, int i10) {
        this.f26453a = i10;
        this.f26454b = om0Var;
    }

    @Override
    public final void run() {
        switch (this.f26453a) {
            case 0:
                om0 om0Var = this.f26454b;
                om0Var.getClass();
                AndroidUtilities.runOnUIThread(new mm0(om0Var, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new mm0(this.f26454b, 3));
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
