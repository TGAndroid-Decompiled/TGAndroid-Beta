package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class k51 implements Runnable {
    public final int f38419a;
    public final org.telegram.ui.Cells.b6 f38420b;

    public k51(org.telegram.ui.Cells.b6 b6Var, int i10) {
        this.f38419a = i10;
        this.f38420b = b6Var;
    }

    @Override
    public final void run() {
        switch (this.f38419a) {
            case 0:
                AndroidUtilities.showKeyboard(((o41) this.f38420b.d).h);
                return;
            default:
                this.f38420b.requestFocus();
                return;
        }
    }
}
