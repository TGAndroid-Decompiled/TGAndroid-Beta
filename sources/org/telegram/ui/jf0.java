package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jf0 implements Runnable {
    public final int f34892a;
    public final lf0 f34893b;

    public jf0(lf0 lf0Var, int i10) {
        this.f34892a = i10;
        this.f34893b = lf0Var;
    }

    @Override
    public final void run() {
        switch (this.f34892a) {
            case 0:
                lf0 lf0Var = this.f34893b;
                org.telegram.ui.Components.aj0 aj0Var = lf0Var.h;
                aj0Var.getAnimatedDrawable().N(0, false, false);
                aj0Var.d();
                EditTextBoldCursor editTextBoldCursor = lf0Var.f35488b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f34893b.f35488b.requestFocus();
                return;
        }
    }
}
