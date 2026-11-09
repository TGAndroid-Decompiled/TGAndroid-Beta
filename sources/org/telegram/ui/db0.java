package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class db0 implements Runnable {
    public final int f44904a;
    public final rc0 f44905b;

    public db0(rc0 rc0Var, int i7) {
        this.f44904a = i7;
        this.f44905b = rc0Var;
    }

    @Override
    public final void run() {
        switch (this.f44904a) {
            case 0:
                this.f44905b.M.m();
                return;
            case 1:
                rc0 rc0Var = this.f44905b;
                rc0Var.N = null;
                rc0Var.O = null;
                rc0Var.o(true);
                rc0Var.f49444e.j(null, null, rc0Var.f49445f, null);
                yc ycVar = rc0Var.f49446n;
                org.telegram.ui.Components.ah0 ah0Var = rc0Var.J;
                ycVar.setAnimation(ah0Var);
                ah0Var.M(0);
                rc0Var.L = true;
                return;
            case 2:
                this.f44905b.L = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f44905b.f49443c;
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
