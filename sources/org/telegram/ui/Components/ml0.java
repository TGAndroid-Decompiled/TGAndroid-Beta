package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

public final class ml0 implements Runnable {

    public final int f30697a;

    public final ol0 f30698b;

    public ml0(ol0 ol0Var, int i10) {
        this.f30697a = i10;
        this.f30698b = ol0Var;
    }

    @Override
    public final void run() {
        switch (this.f30697a) {
            case 0:
                ol0 ol0Var = this.f30698b;
                ol0Var.getClass();
                AndroidUtilities.runOnUIThread(new ml0(ol0Var, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ml0(this.f30698b, 3));
                break;
            case 2:
                super/*android.app.Dialog*/.dismiss();
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
