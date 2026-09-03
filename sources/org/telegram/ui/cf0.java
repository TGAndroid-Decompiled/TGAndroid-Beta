package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class cf0 implements Runnable {
    public final int f35785a;
    public final ef0 f35786b;

    public cf0(ef0 ef0Var, int i10) {
        this.f35785a = i10;
        this.f35786b = ef0Var;
    }

    @Override
    public final void run() {
        switch (this.f35785a) {
            case 0:
                ef0 ef0Var = this.f35786b;
                org.telegram.ui.Components.kj0 kj0Var = ef0Var.h;
                kj0Var.getAnimatedDrawable().L(0, false, false);
                kj0Var.d();
                EditTextBoldCursor editTextBoldCursor = ef0Var.f36475b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f35786b.f36475b.requestFocus();
                return;
        }
    }
}
