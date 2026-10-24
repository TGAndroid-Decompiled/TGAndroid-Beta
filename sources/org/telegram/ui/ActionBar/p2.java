package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class p2 implements Runnable {
    public final int f21753a;
    public final h3 f21754b;

    public p2(h3 h3Var, int i10) {
        this.f21753a = i10;
        this.f21754b = h3Var;
    }

    @Override
    public final void run() {
        switch (this.f21753a) {
            case 0:
                h3 h3Var = this.f21754b;
                h3Var.getClass();
                try {
                    h3Var.dismissInternal();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                h3 h3Var2 = this.f21754b;
                AndroidUtilities.removeFromParent(h3Var2.container);
                h3Var2.attachedFragment.getLayoutContainer().addView(h3Var2.container);
                return;
            default:
                this.f21754b.dismiss();
                return;
        }
    }
}
