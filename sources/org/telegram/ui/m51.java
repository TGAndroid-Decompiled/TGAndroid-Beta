package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class m51 implements Runnable {
    public final int f39010a;
    public final org.telegram.ui.Cells.b6 f39011b;

    public m51(org.telegram.ui.Cells.b6 b6Var, int i10) {
        this.f39010a = i10;
        this.f39011b = b6Var;
    }

    @Override
    public final void run() {
        switch (this.f39010a) {
            case 0:
                AndroidUtilities.showKeyboard(((q41) this.f39011b.d).h);
                return;
            default:
                this.f39011b.requestFocus();
                return;
        }
    }
}
