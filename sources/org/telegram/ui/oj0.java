package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class oj0 implements Runnable {
    public final int f36258a;
    public final wj0 f36259b;

    public oj0(wj0 wj0Var, int i10) {
        this.f36258a = i10;
        this.f36259b = wj0Var;
    }

    @Override
    public final void run() {
        switch (this.f36258a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f36259b.f39380b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f36259b.d.getEditText());
                return;
        }
    }
}
