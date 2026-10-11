package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hf0 implements Runnable {
    public final int f38398a;
    public final jf0 f38399b;

    public hf0(jf0 jf0Var, int i10) {
        this.f38398a = i10;
        this.f38399b = jf0Var;
    }

    @Override
    public final void run() {
        switch (this.f38398a) {
            case 0:
                jf0 jf0Var = this.f38399b;
                org.telegram.ui.Components.hk0 hk0Var = jf0Var.h;
                hk0Var.getAnimatedDrawable().N(0, false, false);
                hk0Var.d();
                EditTextBoldCursor editTextBoldCursor = jf0Var.f39027b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f38399b.f39027b.requestFocus();
                return;
        }
    }
}
