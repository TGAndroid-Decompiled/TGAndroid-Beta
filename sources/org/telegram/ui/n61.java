package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class n61 implements Runnable {
    public final int f35758a;
    public final org.telegram.ui.Cells.c6 f35759b;

    public n61(org.telegram.ui.Cells.c6 c6Var, int i10) {
        this.f35758a = i10;
        this.f35759b = c6Var;
    }

    @Override
    public final void run() {
        switch (this.f35758a) {
            case 0:
                AndroidUtilities.showKeyboard(((r51) this.f35759b.d).h);
                return;
            default:
                this.f35759b.requestFocus();
                return;
        }
    }
}
