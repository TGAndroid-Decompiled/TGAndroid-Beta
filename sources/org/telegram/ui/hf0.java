package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hf0 implements Runnable {
    public final int f37059a;
    public final jf0 f37060b;

    public hf0(jf0 jf0Var, int i10) {
        this.f37059a = i10;
        this.f37060b = jf0Var;
    }

    @Override
    public final void run() {
        switch (this.f37059a) {
            case 0:
                jf0 jf0Var = this.f37060b;
                org.telegram.ui.Components.nj0 nj0Var = jf0Var.h;
                nj0Var.getAnimatedDrawable().N(0, false, false);
                nj0Var.d();
                EditTextBoldCursor editTextBoldCursor = jf0Var.f37672b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f37060b.f37672b.requestFocus();
                return;
        }
    }
}
