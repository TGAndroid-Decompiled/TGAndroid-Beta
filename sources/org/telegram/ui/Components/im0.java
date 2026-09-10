package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class im0 implements Runnable {
    public final int f24046a;
    public final km0 f24047b;

    public im0(km0 km0Var, int i10) {
        this.f24046a = i10;
        this.f24047b = km0Var;
    }

    @Override
    public final void run() {
        switch (this.f24046a) {
            case 0:
                km0 km0Var = this.f24047b;
                km0Var.getClass();
                AndroidUtilities.runOnUIThread(new im0(km0Var, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new im0(this.f24047b, 3));
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
