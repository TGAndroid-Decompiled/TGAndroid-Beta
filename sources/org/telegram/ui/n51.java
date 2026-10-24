package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class n51 implements Runnable {
    public final int f39725a;
    public final org.telegram.ui.Cells.c6 f39726b;

    public n51(org.telegram.ui.Cells.c6 c6Var, int i10) {
        this.f39725a = i10;
        this.f39726b = c6Var;
    }

    @Override
    public final void run() {
        switch (this.f39725a) {
            case 0:
                AndroidUtilities.showKeyboard(((r41) this.f39726b.d).h);
                return;
            default:
                this.f39726b.requestFocus();
                return;
        }
    }
}
