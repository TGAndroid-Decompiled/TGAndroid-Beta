package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hf0 implements Runnable {
    public final int f37079a;
    public final jf0 f37080b;

    public hf0(jf0 jf0Var, int i10) {
        this.f37079a = i10;
        this.f37080b = jf0Var;
    }

    @Override
    public final void run() {
        switch (this.f37079a) {
            case 0:
                jf0 jf0Var = this.f37080b;
                org.telegram.ui.Components.nj0 nj0Var = jf0Var.h;
                nj0Var.getAnimatedDrawable().N(0, false, false);
                nj0Var.d();
                EditTextBoldCursor editTextBoldCursor = jf0Var.f37686b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f37080b.f37686b.requestFocus();
                return;
        }
    }
}
