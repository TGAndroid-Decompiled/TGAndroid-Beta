package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class mj0 implements Runnable {
    public final int f39165a;
    public final uj0 f39166b;

    public mj0(uj0 uj0Var, int i10) {
        this.f39165a = i10;
        this.f39166b = uj0Var;
    }

    @Override
    public final void run() {
        switch (this.f39165a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f39166b.f41953b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f39166b.d.getEditText());
                return;
        }
    }
}
