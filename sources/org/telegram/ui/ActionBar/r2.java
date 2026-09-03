package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class r2 implements Runnable {
    public final int f20537a;
    public final g3 f20538b;

    public r2(g3 g3Var, int i10) {
        this.f20537a = i10;
        this.f20538b = g3Var;
    }

    @Override
    public final void run() {
        switch (this.f20537a) {
            case 0:
                g3 g3Var = this.f20538b;
                AndroidUtilities.removeFromParent(g3Var.container);
                g3Var.attachedFragment.getLayoutContainer().addView(g3Var.container);
                return;
            case 1:
                this.f20538b.dismiss();
                return;
            default:
                g3 g3Var2 = this.f20538b;
                g3Var2.getClass();
                try {
                    g3Var2.dismissInternal();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
        }
    }
}
