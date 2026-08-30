package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class md0 implements Runnable {
    public final int f36270a;
    public final ze0 f36271b;

    public md0(ze0 ze0Var, int i10) {
        this.f36270a = i10;
        this.f36271b = ze0Var;
    }

    @Override
    public final void run() {
        switch (this.f36270a) {
            case 0:
                this.f36271b.I.n();
                return;
            case 1:
                ze0 ze0Var = this.f36271b;
                ze0Var.J = null;
                ze0Var.K = null;
                ze0Var.p(true);
                ze0Var.e.h(null, null, ze0Var.f40781f, null);
                kd kdVar = ze0Var.f40782n;
                org.telegram.ui.Components.gj0 gj0Var = ze0Var.F;
                kdVar.setAnimation(gj0Var);
                gj0Var.K(0);
                ze0Var.H = true;
                return;
            case 2:
                this.f36271b.H = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f36271b.f40780c;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
        }
    }
}
