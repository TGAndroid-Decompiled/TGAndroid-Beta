package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class gf0 implements Runnable {
    public final int f33918a;
    public final if0 f33919b;

    public gf0(if0 if0Var, int i10) {
        this.f33918a = i10;
        this.f33919b = if0Var;
    }

    @Override
    public final void run() {
        switch (this.f33918a) {
            case 0:
                if0 if0Var = this.f33919b;
                org.telegram.ui.Components.nj0 nj0Var = if0Var.h;
                nj0Var.getAnimatedDrawable().N(0, false, false);
                nj0Var.d();
                EditTextBoldCursor editTextBoldCursor = if0Var.f34463b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f33919b.f34463b.requestFocus();
                return;
        }
    }
}
