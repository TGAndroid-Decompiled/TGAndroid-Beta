package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class lf0 implements Runnable {
    public final int f35541a;
    public final nf0 f35542b;

    public lf0(nf0 nf0Var, int i10) {
        this.f35541a = i10;
        this.f35542b = nf0Var;
    }

    @Override
    public final void run() {
        switch (this.f35541a) {
            case 0:
                nf0 nf0Var = this.f35542b;
                org.telegram.ui.Components.bj0 bj0Var = nf0Var.h;
                bj0Var.getAnimatedDrawable().N(0, false, false);
                bj0Var.d();
                EditTextBoldCursor editTextBoldCursor = nf0Var.f36094b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f35542b.f36094b.requestFocus();
                return;
        }
    }
}
