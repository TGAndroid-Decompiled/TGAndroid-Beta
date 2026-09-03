package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class df0 implements Runnable {
    public final int f33458a;
    public final ff0 f33459b;

    public df0(ff0 ff0Var, int i10) {
        this.f33458a = i10;
        this.f33459b = ff0Var;
    }

    @Override
    public final void run() {
        switch (this.f33458a) {
            case 0:
                ff0 ff0Var = this.f33459b;
                org.telegram.ui.Components.jj0 jj0Var = ff0Var.h;
                jj0Var.getAnimatedDrawable().L(0, false, false);
                jj0Var.d();
                EditTextBoldCursor editTextBoldCursor = ff0Var.f34065b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f33459b.f34065b.requestFocus();
                return;
        }
    }
}
