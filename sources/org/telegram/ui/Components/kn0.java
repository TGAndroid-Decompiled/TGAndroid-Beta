package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class kn0 implements Runnable {
    public final int f27900a;
    public final mn0 f27901b;

    public kn0(mn0 mn0Var, int i10) {
        this.f27900a = i10;
        this.f27901b = mn0Var;
    }

    @Override
    public final void run() {
        switch (this.f27900a) {
            case 0:
                mn0 mn0Var = this.f27901b;
                mn0Var.getClass();
                AndroidUtilities.runOnUIThread(new kn0(mn0Var, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new kn0(this.f27901b, 3));
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
