package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class o2 implements Runnable {
    public final int f21251a;
    public final f3 f21252b;

    public o2(f3 f3Var, int i10) {
        this.f21251a = i10;
        this.f21252b = f3Var;
    }

    @Override
    public final void run() {
        switch (this.f21251a) {
            case 0:
                f3 f3Var = this.f21252b;
                f3Var.getClass();
                try {
                    f3Var.dismissInternal();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 1:
                f3 f3Var2 = this.f21252b;
                AndroidUtilities.removeFromParent(f3Var2.container);
                f3Var2.attachedFragment.getLayoutContainer().addView(f3Var2.container);
                return;
            default:
                this.f21252b.dismiss();
                return;
        }
    }
}
