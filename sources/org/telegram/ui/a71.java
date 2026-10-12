package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class a71 implements Runnable {
    public final int f35720a;
    public final org.telegram.ui.Cells.c6 f35721b;

    public a71(org.telegram.ui.Cells.c6 c6Var, int i10) {
        this.f35720a = i10;
        this.f35721b = c6Var;
    }

    @Override
    public final void run() {
        switch (this.f35720a) {
            case 0:
                AndroidUtilities.showKeyboard(((e61) this.f35721b.d).h);
                return;
            default:
                this.f35721b.requestFocus();
                return;
        }
    }
}
