package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class jj0 implements Runnable {
    public final int f38592a;
    public final rj0 f38593b;

    public jj0(rj0 rj0Var, int i10) {
        this.f38592a = i10;
        this.f38593b = rj0Var;
    }

    @Override
    public final void run() {
        switch (this.f38592a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f38593b.f41160b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f38593b.f41162c.getEditText());
                return;
        }
    }
}
