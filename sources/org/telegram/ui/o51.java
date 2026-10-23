package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class o51 implements Runnable {
    public final int f40076a;
    public final org.telegram.ui.Cells.c6 f40077b;

    public o51(org.telegram.ui.Cells.c6 c6Var, int i10) {
        this.f40076a = i10;
        this.f40077b = c6Var;
    }

    @Override
    public final void run() {
        switch (this.f40076a) {
            case 0:
                AndroidUtilities.showKeyboard(((s41) this.f40077b.d).h);
                return;
            default:
                this.f40077b.requestFocus();
                return;
        }
    }
}
