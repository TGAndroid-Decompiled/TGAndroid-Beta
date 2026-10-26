package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class bd0 implements Runnable {
    public final int f38069a;
    public final re0 f38070b;

    public bd0(re0 re0Var, int i10) {
        this.f38069a = i10;
        this.f38070b = re0Var;
    }

    @Override
    public final void run() {
        switch (this.f38069a) {
            case 0:
                this.f38070b.L.m();
                return;
            case 1:
                re0 re0Var = this.f38070b;
                re0Var.M = null;
                re0Var.N = null;
                re0Var.o(true);
                re0Var.e.h(null, null, re0Var.f43128f, null);
                kd kdVar = re0Var.f43129n;
                org.telegram.ui.Components.xj0 xj0Var = re0Var.I;
                kdVar.setAnimation(xj0Var);
                xj0Var.M(0);
                re0Var.K = true;
                return;
            case 2:
                this.f38070b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f38070b.f43127c;
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
