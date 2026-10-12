package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class kn0 implements Runnable {
    public final int f27886a;
    public final mn0 f27887b;

    public kn0(mn0 mn0Var, int i10) {
        this.f27886a = i10;
        this.f27887b = mn0Var;
    }

    @Override
    public final void run() {
        switch (this.f27886a) {
            case 0:
                mn0 mn0Var = this.f27887b;
                mn0Var.getClass();
                AndroidUtilities.runOnUIThread(new kn0(mn0Var, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new kn0(this.f27887b, 3));
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
