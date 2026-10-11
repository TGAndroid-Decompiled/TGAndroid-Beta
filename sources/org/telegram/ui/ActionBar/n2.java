package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class n2 implements Runnable {
    public final int f21398a;
    public final e3 f21399b;

    public n2(e3 e3Var, int i10) {
        this.f21398a = i10;
        this.f21399b = e3Var;
    }

    @Override
    public final void run() {
        switch (this.f21398a) {
            case 0:
                e3 e3Var = this.f21399b;
                e3Var.getClass();
                try {
                    e3Var.dismissInternal();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 1:
                e3 e3Var2 = this.f21399b;
                AndroidUtilities.removeFromParent(e3Var2.container);
                e3Var2.attachedFragment.getLayoutContainer().addView(e3Var2.container);
                return;
            default:
                this.f21399b.dismiss();
                return;
        }
    }
}
