package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class nd1 implements Runnable {

    public final int f40805a;

    public final sd1 f40806b;

    public nd1(sd1 sd1Var, int i10) {
        this.f40805a = i10;
        this.f40806b = sd1Var;
    }

    @Override
    public final void run() {
        switch (this.f40805a) {
            case 0:
                sd1 sd1Var = this.f40806b;
                sd1Var.getClass();
                new ag.g2((org.telegram.ui.ActionBar.n2) sd1Var, 11, false).show();
                break;
            default:
                sd1 sd1Var2 = this.f40806b;
                sd1Var2.f42594e.requestFocus();
                AndroidUtilities.showKeyboard(sd1Var2.f42594e);
                break;
        }
    }
}
