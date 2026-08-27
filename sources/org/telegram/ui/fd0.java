package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class fd0 implements Runnable {

    public final int f38074a;

    public final te0 f38075b;

    public fd0(te0 te0Var, int i10) {
        this.f38074a = i10;
        this.f38075b = te0Var;
    }

    @Override
    public final void run() {
        switch (this.f38074a) {
            case 0:
                this.f38075b.H.n();
                break;
            case 1:
                te0 te0Var = this.f38075b;
                te0Var.I = null;
                te0Var.J = null;
                te0Var.p(true);
                te0Var.f42918e.h(null, null, te0Var.f42919f, null);
                fd fdVar = te0Var.f42920n;
                org.telegram.ui.Components.oi0 oi0Var = te0Var.E;
                fdVar.setAnimation(oi0Var);
                oi0Var.K(0);
                te0Var.G = true;
                break;
            case 2:
                this.f38075b.G = true;
                break;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f38075b.f42917c;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                }
                break;
        }
    }
}
