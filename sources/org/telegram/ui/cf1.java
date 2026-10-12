package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class cf1 implements Runnable {
    public final int f34936a;
    public final hf1 f34937b;

    public cf1(hf1 hf1Var, int i10) {
        this.f34936a = i10;
        this.f34937b = hf1Var;
    }

    @Override
    public final void run() {
        switch (this.f34936a) {
            case 0:
                hf1 hf1Var = this.f34937b;
                hf1Var.getClass();
                new sg.y0((org.telegram.ui.ActionBar.m2) hf1Var, 11, false).show();
                return;
            default:
                hf1 hf1Var2 = this.f34937b;
                hf1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(hf1Var2.e);
                return;
        }
    }
}
