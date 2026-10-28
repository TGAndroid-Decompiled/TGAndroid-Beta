package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class dd0 implements Runnable {
    public final int f38588a;
    public final te0 f38589b;

    public dd0(te0 te0Var, int i10) {
        this.f38588a = i10;
        this.f38589b = te0Var;
    }

    @Override
    public final void run() {
        switch (this.f38588a) {
            case 0:
                this.f38589b.L.m();
                return;
            case 1:
                te0 te0Var = this.f38589b;
                te0Var.M = null;
                te0Var.N = null;
                te0Var.o(true);
                te0Var.e.h(null, null, te0Var.f43613f, null);
                kd kdVar = te0Var.f43614n;
                org.telegram.ui.Components.yj0 yj0Var = te0Var.I;
                kdVar.setAnimation(yj0Var);
                yj0Var.M(0);
                te0Var.K = true;
                return;
            case 2:
                this.f38589b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f38589b.f43612c;
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
