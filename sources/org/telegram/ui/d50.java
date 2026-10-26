package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class d50 implements Runnable {
    public final int f38738a;
    public final e50 f38739b;

    public d50(e50 e50Var, int i10) {
        this.f38738a = i10;
        this.f38739b = e50Var;
    }

    @Override
    public final void run() {
        switch (this.f38738a) {
            case 0:
                e50 e50Var = this.f38739b;
                z10 z10Var = e50Var.f38993b;
                if (z10Var != null) {
                    z10Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new d50(e50Var, 2), 16L);
                return;
            case 1:
                z10 z10Var2 = this.f38739b.f38993b;
                if (z10Var2 != null) {
                    z10Var2.setVisibility(4);
                    return;
                }
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
