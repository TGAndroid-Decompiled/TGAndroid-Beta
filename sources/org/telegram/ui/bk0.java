package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class bk0 implements Runnable {
    public final int f34592a;
    public final ik0 f34593b;

    public bk0(ik0 ik0Var, int i10) {
        this.f34592a = i10;
        this.f34593b = ik0Var;
    }

    @Override
    public final void run() {
        switch (this.f34592a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f34593b.f37153b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f34593b.d.getEditText());
                return;
        }
    }
}
