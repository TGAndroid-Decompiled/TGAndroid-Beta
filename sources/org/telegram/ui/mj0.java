package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class mj0 implements Runnable {
    public final int f38990a;
    public final uj0 f38991b;

    public mj0(uj0 uj0Var, int i10) {
        this.f38990a = i10;
        this.f38991b = uj0Var;
    }

    @Override
    public final void run() {
        switch (this.f38990a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f38991b.f41853b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f38991b.d.getEditText());
                return;
        }
    }
}
