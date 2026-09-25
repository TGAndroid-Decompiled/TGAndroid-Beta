package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class km0 implements Runnable {
    public final int f25820a;
    public final mm0 f25821b;

    public km0(mm0 mm0Var, int i10) {
        this.f25820a = i10;
        this.f25821b = mm0Var;
    }

    @Override
    public final void run() {
        switch (this.f25820a) {
            case 0:
                mm0 mm0Var = this.f25821b;
                mm0Var.getClass();
                AndroidUtilities.runOnUIThread(new km0(mm0Var, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new km0(this.f25821b, 3));
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
