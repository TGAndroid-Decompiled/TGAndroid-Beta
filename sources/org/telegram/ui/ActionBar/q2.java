package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class q2 implements Runnable {
    public final int f23755a;
    public final f3 f23756b;

    public q2(f3 f3Var, int i10) {
        this.f23755a = i10;
        this.f23756b = f3Var;
    }

    @Override
    public final void run() {
        switch (this.f23755a) {
            case 0:
                f3 f3Var = this.f23756b;
                AndroidUtilities.removeFromParent(f3Var.container);
                f3Var.attachedFragment.getLayoutContainer().addView(f3Var.container);
                return;
            case 1:
                this.f23756b.dismiss();
                return;
            default:
                f3 f3Var2 = this.f23756b;
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
