package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class p61 implements Runnable {
    public final int f39359a;
    public final org.telegram.ui.Cells.c6 f39360b;

    public p61(org.telegram.ui.Cells.c6 c6Var, int i10) {
        this.f39359a = i10;
        this.f39360b = c6Var;
    }

    @Override
    public final void run() {
        switch (this.f39359a) {
            case 0:
                AndroidUtilities.showKeyboard(((t51) this.f39360b.d).h);
                return;
            default:
                this.f39360b.requestFocus();
                return;
        }
    }
}
