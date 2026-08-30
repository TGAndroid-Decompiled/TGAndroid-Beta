package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ae1 implements Runnable {
    public final int f32560a;
    public final fe1 f32561b;

    public ae1(fe1 fe1Var, int i10) {
        this.f32560a = i10;
        this.f32561b = fe1Var;
    }

    @Override
    public final void run() {
        switch (this.f32560a) {
            case 0:
                fe1 fe1Var = this.f32561b;
                fe1Var.getClass();
                new eg.o1((org.telegram.ui.ActionBar.p2) fe1Var, 11, false).show();
                return;
            default:
                fe1 fe1Var2 = this.f32561b;
                fe1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(fe1Var2.e);
                return;
        }
    }
}
