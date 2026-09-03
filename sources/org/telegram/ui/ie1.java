package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ie1 implements Runnable {
    public final int f34917a;
    public final ne1 f34918b;

    public ie1(ne1 ne1Var, int i10) {
        this.f34917a = i10;
        this.f34918b = ne1Var;
    }

    @Override
    public final void run() {
        switch (this.f34917a) {
            case 0:
                ne1 ne1Var = this.f34918b;
                ne1Var.getClass();
                new eg.o1((org.telegram.ui.ActionBar.p2) ne1Var, 11, false).show();
                return;
            default:
                ne1 ne1Var2 = this.f34918b;
                ne1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(ne1Var2.e);
                return;
        }
    }
}
