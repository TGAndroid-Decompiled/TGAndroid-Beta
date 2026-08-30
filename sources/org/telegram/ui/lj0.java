package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class lj0 implements Runnable {
    public final int f36096a;
    public final sj0 f36097b;

    public lj0(sj0 sj0Var, int i10) {
        this.f36096a = i10;
        this.f36097b = sj0Var;
    }

    @Override
    public final void run() {
        switch (this.f36096a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f36097b.f38386b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f36097b.d.getEditText());
                return;
        }
    }
}
