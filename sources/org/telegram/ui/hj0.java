package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class hj0 implements Runnable {

    public final int f38850a;

    public final oj0 f38851b;

    public hj0(oj0 oj0Var, int i10) {
        this.f38850a = i10;
        this.f38851b = oj0Var;
    }

    @Override
    public final void run() {
        switch (this.f38850a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f38851b.f41120b);
                break;
            default:
                AndroidUtilities.showKeyboard(this.f38851b.d.getEditText());
                break;
        }
    }
}
