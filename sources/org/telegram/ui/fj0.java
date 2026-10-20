package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class fj0 implements Runnable {
    public final int f37020a;
    public final mj0 f37021b;

    public fj0(mj0 mj0Var, int i10) {
        this.f37020a = i10;
        this.f37021b = mj0Var;
    }

    @Override
    public final void run() {
        switch (this.f37020a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f37021b.f39293b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f37021b.d.getEditText());
                return;
        }
    }
}
