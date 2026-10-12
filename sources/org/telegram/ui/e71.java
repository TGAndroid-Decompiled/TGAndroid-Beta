package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class e71 implements Runnable {
    public final int f35475a;
    public final org.telegram.ui.Cells.c6 f35476b;

    public e71(org.telegram.ui.Cells.c6 c6Var, int i10) {
        this.f35475a = i10;
        this.f35476b = c6Var;
    }

    @Override
    public final void run() {
        switch (this.f35475a) {
            case 0:
                AndroidUtilities.showKeyboard(((i61) this.f35476b.d).h);
                return;
            default:
                this.f35476b.requestFocus();
                return;
        }
    }
}
