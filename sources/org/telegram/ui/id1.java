package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class id1 implements Runnable {
    public final int f37949a;
    public final nd1 f37950b;

    public id1(nd1 nd1Var, int i10) {
        this.f37949a = i10;
        this.f37950b = nd1Var;
    }

    @Override
    public final void run() {
        switch (this.f37949a) {
            case 0:
                nd1 nd1Var = this.f37950b;
                nd1Var.getClass();
                new sg.y0((org.telegram.ui.ActionBar.n2) nd1Var, 11, false).show();
                return;
            default:
                nd1 nd1Var2 = this.f37950b;
                nd1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(nd1Var2.e);
                return;
        }
    }
}
