package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class lf0 implements Runnable {
    public final int f35536a;
    public final nf0 f35537b;

    public lf0(nf0 nf0Var, int i10) {
        this.f35536a = i10;
        this.f35537b = nf0Var;
    }

    @Override
    public final void run() {
        switch (this.f35536a) {
            case 0:
                nf0 nf0Var = this.f35537b;
                org.telegram.ui.Components.bj0 bj0Var = nf0Var.h;
                bj0Var.getAnimatedDrawable().N(0, false, false);
                bj0Var.d();
                EditTextBoldCursor editTextBoldCursor = nf0Var.f36089b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f35537b.f36089b.requestFocus();
                return;
        }
    }
}
