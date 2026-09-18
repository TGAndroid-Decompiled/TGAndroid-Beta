package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class p2 implements Runnable {
    public final int f19486a;
    public final g3 f19487b;

    public p2(g3 g3Var, int i10) {
        this.f19486a = i10;
        this.f19487b = g3Var;
    }

    @Override
    public final void run() {
        switch (this.f19486a) {
            case 0:
                g3 g3Var = this.f19487b;
                g3Var.getClass();
                try {
                    g3Var.dismissInternal();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                g3 g3Var2 = this.f19487b;
                AndroidUtilities.removeFromParent(g3Var2.container);
                g3Var2.attachedFragment.getLayoutContainer().addView(g3Var2.container);
                return;
            default:
                this.f19487b.dismiss();
                return;
        }
    }
}
