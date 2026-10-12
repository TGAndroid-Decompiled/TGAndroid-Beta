package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class of0 implements Runnable {
    public final int f38945a;
    public final qf0 f38946b;

    public of0(qf0 qf0Var, int i10) {
        this.f38945a = i10;
        this.f38946b = qf0Var;
    }

    @Override
    public final void run() {
        switch (this.f38945a) {
            case 0:
                qf0 qf0Var = this.f38946b;
                org.telegram.ui.Components.bk0 bk0Var = qf0Var.h;
                bk0Var.getAnimatedDrawable().N(0, false, false);
                bk0Var.d();
                EditTextBoldCursor editTextBoldCursor = qf0Var.f39428b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f38946b.f39428b.requestFocus();
                return;
        }
    }
}
