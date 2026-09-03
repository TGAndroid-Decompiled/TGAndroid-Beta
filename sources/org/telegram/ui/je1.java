package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class je1 implements Runnable {
    public final int f38036a;
    public final oe1 f38037b;

    public je1(oe1 oe1Var, int i10) {
        this.f38036a = i10;
        this.f38037b = oe1Var;
    }

    @Override
    public final void run() {
        switch (this.f38036a) {
            case 0:
                oe1 oe1Var = this.f38037b;
                oe1Var.getClass();
                new fg.n1((org.telegram.ui.ActionBar.p2) oe1Var, 11, false).show();
                return;
            default:
                oe1 oe1Var2 = this.f38037b;
                oe1Var2.f39679e.requestFocus();
                AndroidUtilities.showKeyboard(oe1Var2.f39679e);
                return;
        }
    }
}
