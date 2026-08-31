package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class hm0 implements Runnable {
    public final int f27516a;
    public final jm0 f27517b;

    public hm0(jm0 jm0Var, int i10) {
        this.f27516a = i10;
        this.f27517b = jm0Var;
    }

    @Override
    public final void run() {
        switch (this.f27516a) {
            case 0:
                jm0 jm0Var = this.f27517b;
                jm0Var.getClass();
                AndroidUtilities.runOnUIThread(new hm0(jm0Var, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new hm0(this.f27517b, 3));
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
