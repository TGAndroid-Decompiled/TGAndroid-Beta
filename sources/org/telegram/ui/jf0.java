package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jf0 implements Runnable {
    public final int f34901a;
    public final lf0 f34902b;

    public jf0(lf0 lf0Var, int i10) {
        this.f34901a = i10;
        this.f34902b = lf0Var;
    }

    @Override
    public final void run() {
        switch (this.f34901a) {
            case 0:
                lf0 lf0Var = this.f34902b;
                org.telegram.ui.Components.aj0 aj0Var = lf0Var.h;
                aj0Var.getAnimatedDrawable().N(0, false, false);
                aj0Var.d();
                EditTextBoldCursor editTextBoldCursor = lf0Var.f35466b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f34902b.f35466b.requestFocus();
                return;
        }
    }
}
