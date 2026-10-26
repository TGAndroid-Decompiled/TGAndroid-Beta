package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class gj0 implements Runnable {
    public final int f39710a;
    public final oj0 f39711b;

    public gj0(oj0 oj0Var, int i10) {
        this.f39710a = i10;
        this.f39711b = oj0Var;
    }

    @Override
    public final void run() {
        switch (this.f39710a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f39711b.f42225b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f39711b.f42227c.getEditText());
                return;
        }
    }
}
