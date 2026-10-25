package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class bd0 implements Runnable {
    public final int f38066a;
    public final re0 f38067b;

    public bd0(re0 re0Var, int i10) {
        this.f38066a = i10;
        this.f38067b = re0Var;
    }

    @Override
    public final void run() {
        switch (this.f38066a) {
            case 0:
                this.f38067b.L.m();
                return;
            case 1:
                re0 re0Var = this.f38067b;
                re0Var.M = null;
                re0Var.N = null;
                re0Var.o(true);
                re0Var.e.h(null, null, re0Var.f43125f, null);
                kd kdVar = re0Var.f43126n;
                org.telegram.ui.Components.xj0 xj0Var = re0Var.I;
                kdVar.setAnimation(xj0Var);
                xj0Var.M(0);
                re0Var.K = true;
                return;
            case 2:
                this.f38067b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f38067b.f43124c;
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
