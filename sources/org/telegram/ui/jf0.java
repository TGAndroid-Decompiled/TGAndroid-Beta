package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jf0 implements Runnable {
    public final int f37764a;
    public final lf0 f37765b;

    public jf0(lf0 lf0Var, int i10) {
        this.f37764a = i10;
        this.f37765b = lf0Var;
    }

    @Override
    public final void run() {
        switch (this.f37764a) {
            case 0:
                lf0 lf0Var = this.f37765b;
                org.telegram.ui.Components.aj0 aj0Var = lf0Var.h;
                aj0Var.getAnimatedDrawable().L(0, false, false);
                aj0Var.d();
                EditTextBoldCursor editTextBoldCursor = lf0Var.f38335b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f37765b.f38335b.requestFocus();
                return;
        }
    }
}
