package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class hj0 implements Runnable {
    public final int f37585a;
    public final oj0 f37586b;

    public hj0(oj0 oj0Var, int i10) {
        this.f37585a = i10;
        this.f37586b = oj0Var;
    }

    @Override
    public final void run() {
        switch (this.f37585a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f37586b.f39847b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f37586b.d.getEditText());
                return;
        }
    }
}
