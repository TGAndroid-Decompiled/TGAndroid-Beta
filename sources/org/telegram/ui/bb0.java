package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class bb0 implements Runnable {
    public final int f44226a;
    public final pc0 f44227b;

    public bb0(pc0 pc0Var, int i7) {
        this.f44226a = i7;
        this.f44227b = pc0Var;
    }

    @Override
    public final void run() {
        switch (this.f44226a) {
            case 0:
                this.f44227b.M.m();
                return;
            case 1:
                pc0 pc0Var = this.f44227b;
                pc0Var.N = null;
                pc0Var.O = null;
                pc0Var.o(true);
                pc0Var.f48795e.j(null, null, pc0Var.f48796f, null);
                yc ycVar = pc0Var.f48797n;
                org.telegram.ui.Components.zg0 zg0Var = pc0Var.J;
                ycVar.setAnimation(zg0Var);
                zg0Var.M(0);
                pc0Var.L = true;
                return;
            case 2:
                this.f44227b.L = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f44227b.f48794c;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    org.telegram.messenger.g0.K3(editTextBoldCursor);
                    return;
                }
                return;
        }
    }
}
