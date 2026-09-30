package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class pj0 implements Runnable {
    public final int f36568a;
    public final wj0 f36569b;

    public pj0(wj0 wj0Var, int i10) {
        this.f36568a = i10;
        this.f36569b = wj0Var;
    }

    @Override
    public final void run() {
        switch (this.f36568a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f36569b.f39379b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f36569b.d.getEditText());
                return;
        }
    }
}
