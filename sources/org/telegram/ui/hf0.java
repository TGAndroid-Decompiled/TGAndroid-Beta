package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hf0 implements Runnable {
    public final int f38432a;
    public final jf0 f38433b;

    public hf0(jf0 jf0Var, int i10) {
        this.f38432a = i10;
        this.f38433b = jf0Var;
    }

    @Override
    public final void run() {
        switch (this.f38432a) {
            case 0:
                jf0 jf0Var = this.f38433b;
                org.telegram.ui.Components.gk0 gk0Var = jf0Var.h;
                gk0Var.getAnimatedDrawable().N(0, false, false);
                gk0Var.d();
                EditTextBoldCursor editTextBoldCursor = jf0Var.f39061b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f38433b.f39061b.requestFocus();
                return;
        }
    }
}
