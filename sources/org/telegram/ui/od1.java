package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class od1 implements Runnable {
    public final int f40140a;
    public final td1 f40141b;

    public od1(td1 td1Var, int i10) {
        this.f40140a = i10;
        this.f40141b = td1Var;
    }

    @Override
    public final void run() {
        switch (this.f40140a) {
            case 0:
                td1 td1Var = this.f40141b;
                td1Var.getClass();
                new sg.y0((org.telegram.ui.ActionBar.o2) td1Var, 11, false).show();
                return;
            default:
                td1 td1Var2 = this.f40141b;
                td1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(td1Var2.e);
                return;
        }
    }
}
