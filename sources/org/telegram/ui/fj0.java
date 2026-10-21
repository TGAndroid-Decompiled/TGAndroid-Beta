package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class fj0 implements Runnable {
    public final int f37021a;
    public final mj0 f37022b;

    public fj0(mj0 mj0Var, int i10) {
        this.f37021a = i10;
        this.f37022b = mj0Var;
    }

    @Override
    public final void run() {
        switch (this.f37021a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f37022b.f39293b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f37022b.d.getEditText());
                return;
        }
    }
}
