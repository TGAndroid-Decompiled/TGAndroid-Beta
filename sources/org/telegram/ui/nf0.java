package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class nf0 implements Runnable {
    public final int f38384a;
    public final pf0 f38385b;

    public nf0(pf0 pf0Var, int i10) {
        this.f38384a = i10;
        this.f38385b = pf0Var;
    }

    @Override
    public final void run() {
        switch (this.f38384a) {
            case 0:
                pf0 pf0Var = this.f38385b;
                org.telegram.ui.Components.bk0 bk0Var = pf0Var.h;
                bk0Var.getAnimatedDrawable().N(0, false, false);
                bk0Var.d();
                EditTextBoldCursor editTextBoldCursor = pf0Var.f38907b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f38385b.f38907b.requestFocus();
                return;
        }
    }
}
