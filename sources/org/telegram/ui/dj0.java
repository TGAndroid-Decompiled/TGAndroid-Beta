package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class dj0 implements Runnable {
    public final int f37550a;
    public final kj0 f37551b;

    public dj0(kj0 kj0Var, int i10) {
        this.f37550a = i10;
        this.f37551b = kj0Var;
    }

    @Override
    public final void run() {
        switch (this.f37550a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f37551b.f39906b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f37551b.d.getEditText());
                return;
        }
    }
}
