package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class p51 implements Runnable {
    public final int f42360a;
    public final org.telegram.ui.Cells.g6 f42361b;

    public p51(org.telegram.ui.Cells.g6 g6Var, int i10) {
        this.f42360a = i10;
        this.f42361b = g6Var;
    }

    @Override
    public final void run() {
        switch (this.f42360a) {
            case 0:
                AndroidUtilities.showKeyboard(((t41) this.f42361b.d).h);
                return;
            default:
                this.f42361b.requestFocus();
                return;
        }
    }
}
