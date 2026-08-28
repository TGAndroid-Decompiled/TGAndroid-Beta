package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class q2 implements Runnable {
    public final int f23733a;
    public final f3 f23734b;

    public q2(f3 f3Var, int i9) {
        this.f23733a = i9;
        this.f23734b = f3Var;
    }

    @Override
    public final void run() {
        switch (this.f23733a) {
            case 0:
                f3 f3Var = this.f23734b;
                AndroidUtilities.removeFromParent(f3Var.container);
                f3Var.attachedFragment.getLayoutContainer().addView(f3Var.container);
                return;
            case 1:
                this.f23734b.dismiss();
                return;
            default:
                f3 f3Var2 = this.f23734b;
                f3Var2.getClass();
                try {
                    f3Var2.dismissInternal();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
