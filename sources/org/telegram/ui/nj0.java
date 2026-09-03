package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class nj0 implements Runnable {
    public final int f36527a;
    public final uj0 f36528b;

    public nj0(uj0 uj0Var, int i10) {
        this.f36527a = i10;
        this.f36528b = uj0Var;
    }

    @Override
    public final void run() {
        switch (this.f36527a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f36528b.f38868b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f36528b.d.getEditText());
                return;
        }
    }
}
