package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class en0 implements Runnable {
    public final int f26136a;
    public final gn0 f26137b;

    public en0(gn0 gn0Var, int i10) {
        this.f26136a = i10;
        this.f26137b = gn0Var;
    }

    @Override
    public final void run() {
        switch (this.f26136a) {
            case 0:
                gn0 gn0Var = this.f26137b;
                gn0Var.getClass();
                AndroidUtilities.runOnUIThread(new en0(gn0Var, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new en0(this.f26137b, 3));
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
