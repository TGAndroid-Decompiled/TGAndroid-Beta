package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class pj0 implements Runnable {
    public final int f36133a;
    public final wj0 f36134b;

    public pj0(wj0 wj0Var, int i10) {
        this.f36133a = i10;
        this.f36134b = wj0Var;
    }

    @Override
    public final void run() {
        switch (this.f36133a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f36134b.f39034b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f36134b.d.getEditText());
                return;
        }
    }
}
