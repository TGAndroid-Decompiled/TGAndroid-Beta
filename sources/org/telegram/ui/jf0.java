package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jf0 implements Runnable {
    public final int f39200a;
    public final lf0 f39201b;

    public jf0(lf0 lf0Var, int i10) {
        this.f39200a = i10;
        this.f39201b = lf0Var;
    }

    @Override
    public final void run() {
        switch (this.f39200a) {
            case 0:
                lf0 lf0Var = this.f39201b;
                org.telegram.ui.Components.ik0 ik0Var = lf0Var.h;
                ik0Var.getAnimatedDrawable().N(0, false, false);
                ik0Var.d();
                EditTextBoldCursor editTextBoldCursor = lf0Var.f39729b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f39201b.f39729b.requestFocus();
                return;
        }
    }
}
