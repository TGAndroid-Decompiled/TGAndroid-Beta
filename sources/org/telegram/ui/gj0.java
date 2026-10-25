package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class gj0 implements Runnable {
    public final int f39707a;
    public final oj0 f39708b;

    public gj0(oj0 oj0Var, int i10) {
        this.f39707a = i10;
        this.f39708b = oj0Var;
    }

    @Override
    public final void run() {
        switch (this.f39707a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f39708b.f42222b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f39708b.f42224c.getEditText());
                return;
        }
    }
}
