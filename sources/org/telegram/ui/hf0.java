package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hf0 implements Runnable {
    public final int f37060a;
    public final jf0 f37061b;

    public hf0(jf0 jf0Var, int i10) {
        this.f37060a = i10;
        this.f37061b = jf0Var;
    }

    @Override
    public final void run() {
        switch (this.f37060a) {
            case 0:
                jf0 jf0Var = this.f37061b;
                org.telegram.ui.Components.nj0 nj0Var = jf0Var.h;
                nj0Var.getAnimatedDrawable().N(0, false, false);
                nj0Var.d();
                EditTextBoldCursor editTextBoldCursor = jf0Var.f37673b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f37061b.f37673b.requestFocus();
                return;
        }
    }
}
