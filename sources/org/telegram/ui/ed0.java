package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ed0 implements Runnable {
    public final int f36924a;
    public final ue0 f36925b;

    public ed0(ue0 ue0Var, int i10) {
        this.f36924a = i10;
        this.f36925b = ue0Var;
    }

    @Override
    public final void run() {
        switch (this.f36924a) {
            case 0:
                this.f36925b.L.m();
                return;
            case 1:
                ue0 ue0Var = this.f36925b;
                ue0Var.M = null;
                ue0Var.N = null;
                ue0Var.o(true);
                ue0Var.e.h(null, null, ue0Var.f42396f, null);
                jd jdVar = ue0Var.f42397n;
                org.telegram.ui.Components.yj0 yj0Var = ue0Var.I;
                jdVar.setAnimation(yj0Var);
                yj0Var.M(0);
                ue0Var.K = true;
                return;
            case 2:
                this.f36925b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f36925b.f42395c;
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
