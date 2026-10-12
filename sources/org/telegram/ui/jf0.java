package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jf0 implements Runnable {
    public final int f39202a;
    public final lf0 f39203b;

    public jf0(lf0 lf0Var, int i10) {
        this.f39202a = i10;
        this.f39203b = lf0Var;
    }

    @Override
    public final void run() {
        switch (this.f39202a) {
            case 0:
                lf0 lf0Var = this.f39203b;
                org.telegram.ui.Components.ik0 ik0Var = lf0Var.h;
                ik0Var.getAnimatedDrawable().N(0, false, false);
                ik0Var.d();
                EditTextBoldCursor editTextBoldCursor = lf0Var.f39723b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f39203b.f39723b.requestFocus();
                return;
        }
    }
}
