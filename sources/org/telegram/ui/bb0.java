package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class bb0 implements Runnable {
    public final int f44243a;
    public final pc0 f44244b;

    public bb0(pc0 pc0Var, int i7) {
        this.f44243a = i7;
        this.f44244b = pc0Var;
    }

    @Override
    public final void run() {
        switch (this.f44243a) {
            case 0:
                this.f44244b.M.m();
                return;
            case 1:
                pc0 pc0Var = this.f44244b;
                pc0Var.N = null;
                pc0Var.O = null;
                pc0Var.o(true);
                pc0Var.f48785e.j(null, null, pc0Var.f48786f, null);
                yc ycVar = pc0Var.f48787n;
                org.telegram.ui.Components.zg0 zg0Var = pc0Var.J;
                ycVar.setAnimation(zg0Var);
                zg0Var.M(0);
                pc0Var.L = true;
                return;
            case 2:
                this.f44244b.L = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f44244b.f48784c;
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
