package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class o2 implements Runnable {
    public final int f19431a;
    public final f3 f19432b;

    public o2(f3 f3Var, int i10) {
        this.f19431a = i10;
        this.f19432b = f3Var;
    }

    @Override
    public final void run() {
        switch (this.f19431a) {
            case 0:
                f3 f3Var = this.f19432b;
                f3Var.getClass();
                try {
                    f3Var.dismissInternal();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                f3 f3Var2 = this.f19432b;
                AndroidUtilities.removeFromParent(f3Var2.container);
                f3Var2.attachedFragment.getLayoutContainer().addView(f3Var2.container);
                return;
            default:
                this.f19432b.dismiss();
                return;
        }
    }
}
