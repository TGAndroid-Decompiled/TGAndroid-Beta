package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class o2 implements Runnable {
    public final int f21651a;
    public final f3 f21652b;

    public o2(f3 f3Var, int i10) {
        this.f21651a = i10;
        this.f21652b = f3Var;
    }

    @Override
    public final void run() {
        switch (this.f21651a) {
            case 0:
                f3 f3Var = this.f21652b;
                f3Var.getClass();
                try {
                    f3Var.dismissInternal();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                f3 f3Var2 = this.f21652b;
                AndroidUtilities.removeFromParent(f3Var2.container);
                f3Var2.attachedFragment.getLayoutContainer().addView(f3Var2.container);
                return;
            default:
                this.f21652b.dismiss();
                return;
        }
    }
}
