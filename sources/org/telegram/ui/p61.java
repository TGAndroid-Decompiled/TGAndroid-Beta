package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class p61 implements Runnable {
    public final int f39354a;
    public final org.telegram.ui.Cells.c6 f39355b;

    public p61(org.telegram.ui.Cells.c6 c6Var, int i10) {
        this.f39354a = i10;
        this.f39355b = c6Var;
    }

    @Override
    public final void run() {
        switch (this.f39354a) {
            case 0:
                AndroidUtilities.showKeyboard(((t51) this.f39355b.d).h);
                return;
            default:
                this.f39355b.requestFocus();
                return;
        }
    }
}
