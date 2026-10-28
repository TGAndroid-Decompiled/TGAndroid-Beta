package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class f50 implements Runnable {
    public final int f39176a;
    public final g50 f39177b;

    public f50(g50 g50Var, int i10) {
        this.f39176a = i10;
        this.f39177b = g50Var;
    }

    @Override
    public final void run() {
        switch (this.f39176a) {
            case 0:
                g50 g50Var = this.f39177b;
                b20 b20Var = g50Var.f39508b;
                if (b20Var != null) {
                    b20Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new f50(g50Var, 2), 16L);
                return;
            case 1:
                b20 b20Var2 = this.f39177b.f39508b;
                if (b20Var2 != null) {
                    b20Var2.setVisibility(4);
                    return;
                }
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
