package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class hj0 implements Runnable {
    public final int f37567a;
    public final oj0 f37568b;

    public hj0(oj0 oj0Var, int i10) {
        this.f37567a = i10;
        this.f37568b = oj0Var;
    }

    @Override
    public final void run() {
        switch (this.f37567a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f37568b.f39826b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f37568b.d.getEditText());
                return;
        }
    }
}
