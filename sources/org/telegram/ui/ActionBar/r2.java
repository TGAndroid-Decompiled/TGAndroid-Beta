package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class r2 implements Runnable {
    public final int f20562a;
    public final g3 f20563b;

    public r2(g3 g3Var, int i10) {
        this.f20562a = i10;
        this.f20563b = g3Var;
    }

    @Override
    public final void run() {
        switch (this.f20562a) {
            case 0:
                g3 g3Var = this.f20563b;
                AndroidUtilities.removeFromParent(g3Var.container);
                g3Var.attachedFragment.getLayoutContainer().addView(g3Var.container);
                return;
            case 1:
                this.f20563b.dismiss();
                return;
            default:
                g3 g3Var2 = this.f20563b;
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
