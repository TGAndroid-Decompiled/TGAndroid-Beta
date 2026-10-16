package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ak0 implements Runnable {
    public final int f33981a;
    public final hk0 f33982b;

    public ak0(hk0 hk0Var, int i10) {
        this.f33981a = i10;
        this.f33982b = hk0Var;
    }

    @Override
    public final void run() {
        switch (this.f33981a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f33982b.f36594b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f33982b.d.getEditText());
                return;
        }
    }
}
