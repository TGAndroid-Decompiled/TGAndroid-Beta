package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class e71 implements Runnable {
    public final int f35213a;
    public final org.telegram.ui.Cells.c6 f35214b;

    public e71(org.telegram.ui.Cells.c6 c6Var, int i10) {
        this.f35213a = i10;
        this.f35214b = c6Var;
    }

    @Override
    public final void run() {
        switch (this.f35213a) {
            case 0:
                AndroidUtilities.showKeyboard(((i61) this.f35214b.d).h);
                return;
            default:
                this.f35214b.requestFocus();
                return;
        }
    }
}
