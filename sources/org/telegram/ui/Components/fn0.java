package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class fn0 implements Runnable {
    public final int f26464a;
    public final hn0 f26465b;

    public fn0(hn0 hn0Var, int i10) {
        this.f26464a = i10;
        this.f26465b = hn0Var;
    }

    @Override
    public final void run() {
        switch (this.f26464a) {
            case 0:
                hn0 hn0Var = this.f26465b;
                hn0Var.getClass();
                AndroidUtilities.runOnUIThread(new fn0(hn0Var, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new fn0(this.f26465b, 3));
                return;
            case 2:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
