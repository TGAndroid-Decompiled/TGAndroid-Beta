package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class m61 implements Runnable {
    public final int f35163a;
    public final org.telegram.ui.Cells.c6 f35164b;

    public m61(org.telegram.ui.Cells.c6 c6Var, int i10) {
        this.f35163a = i10;
        this.f35164b = c6Var;
    }

    @Override
    public final void run() {
        switch (this.f35163a) {
            case 0:
                AndroidUtilities.showKeyboard(((q51) this.f35164b.d).h);
                return;
            default:
                this.f35164b.requestFocus();
                return;
        }
    }
}
