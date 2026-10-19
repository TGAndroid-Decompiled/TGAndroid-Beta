package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class fj0 implements Runnable {
    public final int f37014a;
    public final mj0 f37015b;

    public fj0(mj0 mj0Var, int i10) {
        this.f37014a = i10;
        this.f37015b = mj0Var;
    }

    @Override
    public final void run() {
        switch (this.f37014a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f37015b.f39287b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f37015b.d.getEditText());
                return;
        }
    }
}
