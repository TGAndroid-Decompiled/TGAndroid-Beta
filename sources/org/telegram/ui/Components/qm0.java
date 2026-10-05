package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class qm0 implements Runnable {
    public final int f30125a;
    public final sm0 f30126b;

    public qm0(sm0 sm0Var, int i10) {
        this.f30125a = i10;
        this.f30126b = sm0Var;
    }

    @Override
    public final void run() {
        switch (this.f30125a) {
            case 0:
                sm0 sm0Var = this.f30126b;
                sm0Var.getClass();
                AndroidUtilities.runOnUIThread(new qm0(sm0Var, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new qm0(this.f30126b, 3));
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
