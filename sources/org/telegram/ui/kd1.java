package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class kd1 implements Runnable {
    public final int f38469a;
    public final pd1 f38470b;

    public kd1(pd1 pd1Var, int i10) {
        this.f38469a = i10;
        this.f38470b = pd1Var;
    }

    @Override
    public final void run() {
        switch (this.f38469a) {
            case 0:
                pd1 pd1Var = this.f38470b;
                pd1Var.getClass();
                new sg.y0((org.telegram.ui.ActionBar.n2) pd1Var, 11, false).show();
                return;
            default:
                pd1 pd1Var2 = this.f38470b;
                pd1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(pd1Var2.e);
                return;
        }
    }
}
