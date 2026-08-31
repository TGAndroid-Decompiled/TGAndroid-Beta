package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class cf0 implements Runnable {
    public final int f35793a;
    public final ef0 f35794b;

    public cf0(ef0 ef0Var, int i10) {
        this.f35793a = i10;
        this.f35794b = ef0Var;
    }

    @Override
    public final void run() {
        switch (this.f35793a) {
            case 0:
                ef0 ef0Var = this.f35794b;
                org.telegram.ui.Components.lj0 lj0Var = ef0Var.h;
                lj0Var.getAnimatedDrawable().L(0, false, false);
                lj0Var.d();
                EditTextBoldCursor editTextBoldCursor = ef0Var.f36574b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f35794b.f36574b.requestFocus();
                return;
        }
    }
}
