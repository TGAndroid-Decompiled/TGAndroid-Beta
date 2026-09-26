package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class lm0 implements Runnable {
    public final int f26111a;
    public final nm0 f26112b;

    public lm0(nm0 nm0Var, int i10) {
        this.f26111a = i10;
        this.f26112b = nm0Var;
    }

    @Override
    public final void run() {
        switch (this.f26111a) {
            case 0:
                nm0 nm0Var = this.f26112b;
                nm0Var.getClass();
                AndroidUtilities.runOnUIThread(new lm0(nm0Var, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new lm0(this.f26112b, 3));
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
