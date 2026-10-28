package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ij0 implements Runnable {
    public final int f40200a;
    public final qj0 f40201b;

    public ij0(qj0 qj0Var, int i10) {
        this.f40200a = i10;
        this.f40201b = qj0Var;
    }

    @Override
    public final void run() {
        switch (this.f40200a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f40201b.f42726b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f40201b.f42728c.getEditText());
                return;
        }
    }
}
