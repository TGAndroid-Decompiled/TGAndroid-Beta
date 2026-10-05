package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ne1 implements Runnable {
    public final int f38949a;
    public final se1 f38950b;

    public ne1(se1 se1Var, int i10) {
        this.f38949a = i10;
        this.f38950b = se1Var;
    }

    @Override
    public final void run() {
        switch (this.f38949a) {
            case 0:
                se1 se1Var = this.f38950b;
                se1Var.getClass();
                new rg.y0((org.telegram.ui.ActionBar.n2) se1Var, 11, false).show();
                return;
            default:
                se1 se1Var2 = this.f38950b;
                se1Var2.f40457e.requestFocus();
                AndroidUtilities.showKeyboard(se1Var2.f40457e);
                return;
        }
    }
}
