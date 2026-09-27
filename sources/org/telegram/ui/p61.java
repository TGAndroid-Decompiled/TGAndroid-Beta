package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class p61 implements Runnable {
    public final int f36338a;
    public final org.telegram.ui.Cells.c6 f36339b;

    public p61(org.telegram.ui.Cells.c6 c6Var, int i10) {
        this.f36338a = i10;
        this.f36339b = c6Var;
    }

    @Override
    public final void run() {
        switch (this.f36338a) {
            case 0:
                AndroidUtilities.showKeyboard(((t51) this.f36339b.d).h);
                return;
            default:
                this.f36339b.requestFocus();
                return;
        }
    }
}
