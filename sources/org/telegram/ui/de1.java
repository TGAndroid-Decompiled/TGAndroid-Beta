package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class de1 implements Runnable {
    public final int f36210a;
    public final ie1 f36211b;

    public de1(ie1 ie1Var, int i10) {
        this.f36210a = i10;
        this.f36211b = ie1Var;
    }

    @Override
    public final void run() {
        switch (this.f36210a) {
            case 0:
                ie1 ie1Var = this.f36211b;
                ie1Var.getClass();
                new fg.n1((org.telegram.ui.ActionBar.p2) ie1Var, 11, false).show();
                return;
            default:
                ie1 ie1Var2 = this.f36211b;
                ie1Var2.f37823e.requestFocus();
                AndroidUtilities.showKeyboard(ie1Var2.f37823e);
                return;
        }
    }
}
