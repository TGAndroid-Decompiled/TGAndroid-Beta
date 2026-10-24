package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class nd1 implements Runnable {
    public final int f39807a;
    public final sd1 f39808b;

    public nd1(sd1 sd1Var, int i10) {
        this.f39807a = i10;
        this.f39808b = sd1Var;
    }

    @Override
    public final void run() {
        switch (this.f39807a) {
            case 0:
                sd1 sd1Var = this.f39808b;
                sd1Var.getClass();
                new sg.y0((org.telegram.ui.ActionBar.o2) sd1Var, 11, false).show();
                return;
            default:
                sd1 sd1Var2 = this.f39808b;
                sd1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(sd1Var2.e);
                return;
        }
    }
}
