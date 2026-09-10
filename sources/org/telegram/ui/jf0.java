package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jf0 implements Runnable {
    public final int f34091a;
    public final lf0 f34092b;

    public jf0(lf0 lf0Var, int i10) {
        this.f34091a = i10;
        this.f34092b = lf0Var;
    }

    @Override
    public final void run() {
        switch (this.f34091a) {
            case 0:
                lf0 lf0Var = this.f34092b;
                org.telegram.ui.Components.kj0 kj0Var = lf0Var.h;
                kj0Var.getAnimatedDrawable().N(0, false, false);
                kj0Var.d();
                EditTextBoldCursor editTextBoldCursor = lf0Var.f34698b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f34092b.f34698b.requestFocus();
                return;
        }
    }
}
