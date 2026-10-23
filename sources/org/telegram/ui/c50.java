package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class c50 implements Runnable {
    public final int f36246a;
    public final d50 f36247b;

    public c50(d50 d50Var, int i10) {
        this.f36246a = i10;
        this.f36247b = d50Var;
    }

    @Override
    public final void run() {
        switch (this.f36246a) {
            case 0:
                d50 d50Var = this.f36247b;
                e50 e50Var = d50Var.f36506b;
                if (e50Var != null) {
                    e50Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new c50(d50Var, 2), 16L);
                return;
            case 1:
                e50 e50Var2 = this.f36247b.f36506b;
                if (e50Var2 != null) {
                    e50Var2.setVisibility(4);
                    return;
                }
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
