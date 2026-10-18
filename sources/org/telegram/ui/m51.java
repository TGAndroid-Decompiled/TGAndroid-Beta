package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class m51 implements Runnable {
    public final int f38991a;
    public final org.telegram.ui.Cells.b6 f38992b;

    public m51(org.telegram.ui.Cells.b6 b6Var, int i10) {
        this.f38991a = i10;
        this.f38992b = b6Var;
    }

    @Override
    public final void run() {
        switch (this.f38991a) {
            case 0:
                AndroidUtilities.showKeyboard(((q41) this.f38992b.d).h);
                return;
            default:
                this.f38992b.requestFocus();
                return;
        }
    }
}
