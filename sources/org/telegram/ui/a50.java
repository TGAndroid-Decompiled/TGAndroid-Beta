package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class a50 implements Runnable {

    public final int f36377a;

    public final b50 f36378b;

    public a50(b50 b50Var, int i10) {
        this.f36377a = i10;
        this.f36378b = b50Var;
    }

    @Override
    public final void run() {
        switch (this.f36377a) {
            case 0:
                b50 b50Var = this.f36378b;
                ag.s0 s0Var = b50Var.f36700b;
                if (s0Var != null) {
                    s0Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new a50(b50Var, 2), 16L);
                break;
            case 1:
                ag.s0 s0Var2 = this.f36378b.f36700b;
                if (s0Var2 != null) {
                    s0Var2.setVisibility(4);
                }
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
