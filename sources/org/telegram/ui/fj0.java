package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class fj0 implements Runnable {
    public final int f37025a;
    public final mj0 f37026b;

    public fj0(mj0 mj0Var, int i10) {
        this.f37025a = i10;
        this.f37026b = mj0Var;
    }

    @Override
    public final void run() {
        switch (this.f37025a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f37026b.f39297b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f37026b.d.getEditText());
                return;
        }
    }
}
