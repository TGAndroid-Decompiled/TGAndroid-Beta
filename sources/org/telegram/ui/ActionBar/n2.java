package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class n2 implements Runnable {
    public final int f20245a;
    public final e3 f20246b;

    public n2(e3 e3Var, int i10) {
        this.f20245a = i10;
        this.f20246b = e3Var;
    }

    @Override
    public final void run() {
        switch (this.f20245a) {
            case 0:
                e3 e3Var = this.f20246b;
                e3Var.getClass();
                try {
                    e3Var.dismissInternal();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                e3 e3Var2 = this.f20246b;
                AndroidUtilities.removeFromParent(e3Var2.container);
                e3Var2.attachedFragment.getLayoutContainer().addView(e3Var2.container);
                return;
            default:
                this.f20246b.dismiss();
                return;
        }
    }
}
