package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class pe1 implements Runnable {
    public final int f39461a;
    public final ue1 f39462b;

    public pe1(ue1 ue1Var, int i10) {
        this.f39461a = i10;
        this.f39462b = ue1Var;
    }

    @Override
    public final void run() {
        switch (this.f39461a) {
            case 0:
                ue1 ue1Var = this.f39462b;
                ue1Var.getClass();
                new rg.y0((org.telegram.ui.ActionBar.n2) ue1Var, 11, false).show();
                return;
            default:
                ue1 ue1Var2 = this.f39462b;
                ue1Var2.f41157e.requestFocus();
                AndroidUtilities.showKeyboard(ue1Var2.f41157e);
                return;
        }
    }
}
