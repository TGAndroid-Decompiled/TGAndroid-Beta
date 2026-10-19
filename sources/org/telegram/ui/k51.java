package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class k51 implements Runnable {
    public final int f38418a;
    public final org.telegram.ui.Cells.b6 f38419b;

    public k51(org.telegram.ui.Cells.b6 b6Var, int i10) {
        this.f38418a = i10;
        this.f38419b = b6Var;
    }

    @Override
    public final void run() {
        switch (this.f38418a) {
            case 0:
                AndroidUtilities.showKeyboard(((o41) this.f38419b.d).h);
                return;
            default:
                this.f38419b.requestFocus();
                return;
        }
    }
}
