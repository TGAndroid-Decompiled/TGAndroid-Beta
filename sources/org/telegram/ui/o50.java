package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class o50 implements Runnable {
    public final int f40413a;
    public final p50 f40414b;

    public o50(p50 p50Var, int i10) {
        this.f40413a = i10;
        this.f40414b = p50Var;
    }

    @Override
    public final void run() {
        switch (this.f40413a) {
            case 0:
                p50 p50Var = this.f40414b;
                q50 q50Var = p50Var.f40668b;
                if (q50Var != null) {
                    q50Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new o50(p50Var, 2), 16L);
                return;
            case 1:
                q50 q50Var2 = this.f40414b.f40668b;
                if (q50Var2 != null) {
                    q50Var2.setVisibility(4);
                    return;
                }
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
