package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class p2 implements Runnable {
    public final int f21752a;
    public final h3 f21753b;

    public p2(h3 h3Var, int i10) {
        this.f21752a = i10;
        this.f21753b = h3Var;
    }

    @Override
    public final void run() {
        switch (this.f21752a) {
            case 0:
                h3 h3Var = this.f21753b;
                h3Var.getClass();
                try {
                    h3Var.dismissInternal();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                h3 h3Var2 = this.f21753b;
                AndroidUtilities.removeFromParent(h3Var2.container);
                h3Var2.attachedFragment.getLayoutContainer().addView(h3Var2.container);
                return;
            default:
                this.f21753b.dismiss();
                return;
        }
    }
}
