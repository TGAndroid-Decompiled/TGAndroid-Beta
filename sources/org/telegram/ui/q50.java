package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class q50 implements Runnable {
    public final int f36760a;
    public final r50 f36761b;

    public q50(r50 r50Var, int i10) {
        this.f36760a = i10;
        this.f36761b = r50Var;
    }

    @Override
    public final void run() {
        switch (this.f36760a) {
            case 0:
                r50 r50Var = this.f36761b;
                s50 s50Var = r50Var.f37028b;
                if (s50Var != null) {
                    s50Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new q50(r50Var, 2), 16L);
                return;
            case 1:
                s50 s50Var2 = this.f36761b.f37028b;
                if (s50Var2 != null) {
                    s50Var2.setVisibility(4);
                    return;
                }
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
