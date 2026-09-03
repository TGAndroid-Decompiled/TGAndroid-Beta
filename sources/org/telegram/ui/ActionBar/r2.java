package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class r2 implements Runnable {
    public final int f22271a;
    public final h3 f22272b;

    public r2(h3 h3Var, int i10) {
        this.f22271a = i10;
        this.f22272b = h3Var;
    }

    @Override
    public final void run() {
        switch (this.f22271a) {
            case 0:
                h3 h3Var = this.f22272b;
                AndroidUtilities.removeFromParent(h3Var.container);
                h3Var.attachedFragment.getLayoutContainer().addView(h3Var.container);
                return;
            case 1:
                this.f22272b.dismiss();
                return;
            default:
                h3 h3Var2 = this.f22272b;
                h3Var2.getClass();
                try {
                    h3Var2.dismissInternal();
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
        }
    }
}
