package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jf0 implements Runnable {
    public final int f37763a;
    public final lf0 f37764b;

    public jf0(lf0 lf0Var, int i10) {
        this.f37763a = i10;
        this.f37764b = lf0Var;
    }

    @Override
    public final void run() {
        switch (this.f37763a) {
            case 0:
                lf0 lf0Var = this.f37764b;
                org.telegram.ui.Components.aj0 aj0Var = lf0Var.h;
                aj0Var.getAnimatedDrawable().L(0, false, false);
                aj0Var.d();
                EditTextBoldCursor editTextBoldCursor = lf0Var.f38334b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f37764b.f38334b.requestFocus();
                return;
        }
    }
}
