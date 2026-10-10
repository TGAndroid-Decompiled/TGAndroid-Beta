package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class if0 implements Runnable {
    public final int f38670a;
    public final kf0 f38671b;

    public if0(kf0 kf0Var, int i10) {
        this.f38670a = i10;
        this.f38671b = kf0Var;
    }

    @Override
    public final void run() {
        switch (this.f38670a) {
            case 0:
                kf0 kf0Var = this.f38671b;
                org.telegram.ui.Components.gk0 gk0Var = kf0Var.h;
                gk0Var.getAnimatedDrawable().N(0, false, false);
                gk0Var.d();
                EditTextBoldCursor editTextBoldCursor = kf0Var.f39309b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f38671b.f39309b.requestFocus();
                return;
        }
    }
}
