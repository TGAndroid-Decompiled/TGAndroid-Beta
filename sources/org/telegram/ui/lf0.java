package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class lf0 implements Runnable {
    public final int f35433a;
    public final nf0 f35434b;

    public lf0(nf0 nf0Var, int i10) {
        this.f35433a = i10;
        this.f35434b = nf0Var;
    }

    @Override
    public final void run() {
        switch (this.f35433a) {
            case 0:
                nf0 nf0Var = this.f35434b;
                org.telegram.ui.Components.kj0 kj0Var = nf0Var.h;
                kj0Var.getAnimatedDrawable().N(0, false, false);
                kj0Var.d();
                EditTextBoldCursor editTextBoldCursor = nf0Var.f36008b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f35434b.f36008b.requestFocus();
                return;
        }
    }
}
