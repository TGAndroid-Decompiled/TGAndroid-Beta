package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class od1 implements Runnable {
    public final int f41096a;
    public final td1 f41097b;

    public od1(td1 td1Var, int i10) {
        this.f41096a = i10;
        this.f41097b = td1Var;
    }

    @Override
    public final void run() {
        switch (this.f41096a) {
            case 0:
                td1 td1Var = this.f41097b;
                td1Var.getClass();
                new cg.p1((org.telegram.ui.ActionBar.o2) td1Var, 11, false).show();
                return;
            default:
                td1 td1Var2 = this.f41097b;
                td1Var2.f42663e.requestFocus();
                AndroidUtilities.showKeyboard(td1Var2.f42663e);
                return;
        }
    }
}
