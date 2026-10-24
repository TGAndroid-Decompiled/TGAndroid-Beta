package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class zm0 implements Runnable {
    public final int f33297a;
    public final bn0 f33298b;

    public zm0(bn0 bn0Var, int i10) {
        this.f33297a = i10;
        this.f33298b = bn0Var;
    }

    @Override
    public final void run() {
        switch (this.f33297a) {
            case 0:
                bn0 bn0Var = this.f33298b;
                bn0Var.getClass();
                AndroidUtilities.runOnUIThread(new zm0(bn0Var, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new zm0(this.f33298b, 3));
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
