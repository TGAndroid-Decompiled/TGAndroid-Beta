package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

public final class p2 implements Runnable {

    public final int f23726a;

    public final e3 f23727b;

    public p2(e3 e3Var, int i10) {
        this.f23726a = i10;
        this.f23727b = e3Var;
    }

    @Override
    public final void run() {
        switch (this.f23726a) {
            case 0:
                e3 e3Var = this.f23727b;
                AndroidUtilities.removeFromParent(e3Var.container);
                e3Var.attachedFragment.getLayoutContainer().addView(e3Var.container);
                break;
            case 1:
                this.f23727b.dismiss();
                break;
            default:
                e3 e3Var2 = this.f23727b;
                e3Var2.getClass();
                try {
                    e3Var2.dismissInternal();
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                break;
        }
    }
}
