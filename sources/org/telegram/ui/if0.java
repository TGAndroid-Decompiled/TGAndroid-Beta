package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class if0 implements Runnable {
    public final int f38626a;
    public final kf0 f38627b;

    public if0(kf0 kf0Var, int i10) {
        this.f38626a = i10;
        this.f38627b = kf0Var;
    }

    @Override
    public final void run() {
        switch (this.f38626a) {
            case 0:
                kf0 kf0Var = this.f38627b;
                org.telegram.ui.Components.fk0 fk0Var = kf0Var.h;
                fk0Var.getAnimatedDrawable().N(0, false, false);
                fk0Var.d();
                EditTextBoldCursor editTextBoldCursor = kf0Var.f39265b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f38627b.f39265b.requestFocus();
                return;
        }
    }
}
