package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class q2 implements Runnable {
    public final int f18572a;
    public final h3 f18573b;

    public q2(h3 h3Var, int i10) {
        this.f18572a = i10;
        this.f18573b = h3Var;
    }

    @Override
    public final void run() {
        switch (this.f18572a) {
            case 0:
                h3 h3Var = this.f18573b;
                h3Var.getClass();
                try {
                    h3Var.dismissInternal();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                h3 h3Var2 = this.f18573b;
                AndroidUtilities.removeFromParent(h3Var2.container);
                h3Var2.attachedFragment.getLayoutContainer().addView(h3Var2.container);
                return;
            default:
                this.f18573b.dismiss();
                return;
        }
    }
}
