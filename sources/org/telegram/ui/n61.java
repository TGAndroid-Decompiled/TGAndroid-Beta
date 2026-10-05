package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class n61 implements Runnable {
    public final int f38817a;
    public final org.telegram.ui.Cells.c6 f38818b;

    public n61(org.telegram.ui.Cells.c6 c6Var, int i10) {
        this.f38817a = i10;
        this.f38818b = c6Var;
    }

    @Override
    public final void run() {
        switch (this.f38817a) {
            case 0:
                AndroidUtilities.showKeyboard(((r51) this.f38818b.d).h);
                return;
            default:
                this.f38818b.requestFocus();
                return;
        }
    }
}
