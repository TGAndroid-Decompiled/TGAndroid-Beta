package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class kd1 implements Runnable {
    public final int f38483a;
    public final pd1 f38484b;

    public kd1(pd1 pd1Var, int i10) {
        this.f38483a = i10;
        this.f38484b = pd1Var;
    }

    @Override
    public final void run() {
        switch (this.f38483a) {
            case 0:
                pd1 pd1Var = this.f38484b;
                pd1Var.getClass();
                new sg.x0((org.telegram.ui.ActionBar.n2) pd1Var, 11, false).show();
                return;
            default:
                pd1 pd1Var2 = this.f38484b;
                pd1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(pd1Var2.e);
                return;
        }
    }
}
