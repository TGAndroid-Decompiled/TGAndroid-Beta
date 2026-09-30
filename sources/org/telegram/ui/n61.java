package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class n61 implements Runnable {
    public final int f35865a;
    public final org.telegram.ui.Cells.c6 f35866b;

    public n61(org.telegram.ui.Cells.c6 c6Var, int i10) {
        this.f35865a = i10;
        this.f35866b = c6Var;
    }

    @Override
    public final void run() {
        switch (this.f35865a) {
            case 0:
                AndroidUtilities.showKeyboard(((r51) this.f35866b.d).h);
                return;
            default:
                this.f35866b.requestFocus();
                return;
        }
    }
}
