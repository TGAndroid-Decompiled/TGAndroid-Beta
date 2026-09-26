package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class km0 implements Runnable {
    public final int f25819a;
    public final mm0 f25820b;

    public km0(mm0 mm0Var, int i10) {
        this.f25819a = i10;
        this.f25820b = mm0Var;
    }

    @Override
    public final void run() {
        switch (this.f25819a) {
            case 0:
                mm0 mm0Var = this.f25820b;
                mm0Var.getClass();
                AndroidUtilities.runOnUIThread(new km0(mm0Var, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new km0(this.f25820b, 3));
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
