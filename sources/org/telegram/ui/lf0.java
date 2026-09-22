package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class lf0 implements Runnable {
    public final int f35451a;
    public final nf0 f35452b;

    public lf0(nf0 nf0Var, int i10) {
        this.f35451a = i10;
        this.f35452b = nf0Var;
    }

    @Override
    public final void run() {
        switch (this.f35451a) {
            case 0:
                nf0 nf0Var = this.f35452b;
                org.telegram.ui.Components.nj0 nj0Var = nf0Var.h;
                nj0Var.getAnimatedDrawable().N(0, false, false);
                nj0Var.d();
                EditTextBoldCursor editTextBoldCursor = nf0Var.f36029b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f35452b.f36029b.requestFocus();
                return;
        }
    }
}
