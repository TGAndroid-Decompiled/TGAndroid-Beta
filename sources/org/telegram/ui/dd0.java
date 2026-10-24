package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class dd0 implements Runnable {
    public final int f36586a;
    public final te0 f36587b;

    public dd0(te0 te0Var, int i10) {
        this.f36586a = i10;
        this.f36587b = te0Var;
    }

    @Override
    public final void run() {
        switch (this.f36586a) {
            case 0:
                this.f36587b.L.m();
                return;
            case 1:
                te0 te0Var = this.f36587b;
                te0Var.M = null;
                te0Var.N = null;
                te0Var.o(true);
                te0Var.e.h(null, null, te0Var.f42018f, null);
                jd jdVar = te0Var.f42019n;
                org.telegram.ui.Components.xj0 xj0Var = te0Var.I;
                jdVar.setAnimation(xj0Var);
                xj0Var.M(0);
                te0Var.K = true;
                return;
            case 2:
                this.f36587b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f36587b.f42017c;
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
