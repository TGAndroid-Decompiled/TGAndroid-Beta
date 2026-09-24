package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class pj0 implements Runnable {
    public final int f36556a;
    public final wj0 f36557b;

    public pj0(wj0 wj0Var, int i10) {
        this.f36556a = i10;
        this.f36557b = wj0Var;
    }

    @Override
    public final void run() {
        switch (this.f36556a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f36557b.f39364b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f36557b.d.getEditText());
                return;
        }
    }
}
