package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ej0 implements Runnable {
    public final int f36677a;
    public final mj0 f36678b;

    public ej0(mj0 mj0Var, int i10) {
        this.f36677a = i10;
        this.f36678b = mj0Var;
    }

    @Override
    public final void run() {
        switch (this.f36677a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f36678b.f39291b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f36678b.d.getEditText());
                return;
        }
    }
}
