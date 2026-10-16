package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class bf1 implements Runnable {
    public final int f34322a;
    public final gf1 f34323b;

    public bf1(gf1 gf1Var, int i10) {
        this.f34322a = i10;
        this.f34323b = gf1Var;
    }

    @Override
    public final void run() {
        switch (this.f34322a) {
            case 0:
                gf1 gf1Var = this.f34323b;
                gf1Var.getClass();
                new sg.y0((org.telegram.ui.ActionBar.m2) gf1Var, 11, false).show();
                return;
            default:
                gf1 gf1Var2 = this.f34323b;
                gf1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(gf1Var2.e);
                return;
        }
    }
}
