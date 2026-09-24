package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class n2 implements Runnable {
    public final int f19645a;
    public final e3 f19646b;

    public n2(e3 e3Var, int i10) {
        this.f19645a = i10;
        this.f19646b = e3Var;
    }

    @Override
    public final void run() {
        switch (this.f19645a) {
            case 0:
                e3 e3Var = this.f19646b;
                e3Var.getClass();
                try {
                    e3Var.dismissInternal();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                e3 e3Var2 = this.f19646b;
                AndroidUtilities.removeFromParent(e3Var2.container);
                e3Var2.attachedFragment.getLayoutContainer().addView(e3Var2.container);
                return;
            default:
                this.f19646b.dismiss();
                return;
        }
    }
}
