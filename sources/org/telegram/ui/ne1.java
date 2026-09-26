package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ne1 implements Runnable {
    public final int f35864a;
    public final se1 f35865b;

    public ne1(se1 se1Var, int i10) {
        this.f35864a = i10;
        this.f35865b = se1Var;
    }

    @Override
    public final void run() {
        switch (this.f35864a) {
            case 0:
                se1 se1Var = this.f35865b;
                se1Var.getClass();
                new rg.x0((org.telegram.ui.ActionBar.m2) se1Var, 11, false).show();
                return;
            default:
                se1 se1Var2 = this.f35865b;
                se1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(se1Var2.e);
                return;
        }
    }
}
