package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class n61 implements Runnable {
    public final int f35755a;
    public final org.telegram.ui.Cells.c6 f35756b;

    public n61(org.telegram.ui.Cells.c6 c6Var, int i10) {
        this.f35755a = i10;
        this.f35756b = c6Var;
    }

    @Override
    public final void run() {
        switch (this.f35755a) {
            case 0:
                AndroidUtilities.showKeyboard(((r51) this.f35756b.d).h);
                return;
            default:
                this.f35756b.requestFocus();
                return;
        }
    }
}
