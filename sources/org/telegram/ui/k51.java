package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class k51 implements Runnable {
    public final int f38430a;
    public final org.telegram.ui.Cells.b6 f38431b;

    public k51(org.telegram.ui.Cells.b6 b6Var, int i10) {
        this.f38430a = i10;
        this.f38431b = b6Var;
    }

    @Override
    public final void run() {
        switch (this.f38430a) {
            case 0:
                AndroidUtilities.showKeyboard(((o41) this.f38431b.d).h);
                return;
            default:
                this.f38431b.requestFocus();
                return;
        }
    }
}
