package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class gm0 implements Runnable {
    public final int f27199a;
    public final im0 f27200b;

    public gm0(im0 im0Var, int i10) {
        this.f27199a = i10;
        this.f27200b = im0Var;
    }

    @Override
    public final void run() {
        switch (this.f27199a) {
            case 0:
                im0 im0Var = this.f27200b;
                im0Var.getClass();
                AndroidUtilities.runOnUIThread(new gm0(im0Var, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new gm0(this.f27200b, 3));
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
