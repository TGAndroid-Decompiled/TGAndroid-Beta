package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class fj0 implements Runnable {
    public final int f37024a;
    public final mj0 f37025b;

    public fj0(mj0 mj0Var, int i10) {
        this.f37024a = i10;
        this.f37025b = mj0Var;
    }

    @Override
    public final void run() {
        switch (this.f37024a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f37025b.f39296b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f37025b.d.getEditText());
                return;
        }
    }
}
