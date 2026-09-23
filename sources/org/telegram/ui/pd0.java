package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class pd0 implements Runnable {
    public final int f36091a;
    public final cf0 f36092b;

    public pd0(cf0 cf0Var, int i10) {
        this.f36091a = i10;
        this.f36092b = cf0Var;
    }

    @Override
    public final void run() {
        switch (this.f36091a) {
            case 0:
                this.f36092b.L.n();
                return;
            case 1:
                cf0 cf0Var = this.f36092b;
                cf0Var.M = null;
                cf0Var.N = null;
                cf0Var.p(true);
                cf0Var.e.h(null, null, cf0Var.f32332f, null);
                id idVar = cf0Var.f32333n;
                org.telegram.ui.Components.yi0 yi0Var = cf0Var.I;
                idVar.setAnimation(yi0Var);
                yi0Var.M(0);
                cf0Var.K = true;
                return;
            case 2:
                this.f36092b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f36092b.f32331c;
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
