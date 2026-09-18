package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class kf0 implements Runnable {
    public final int f35087a;
    public final mf0 f35088b;

    public kf0(mf0 mf0Var, int i10) {
        this.f35087a = i10;
        this.f35088b = mf0Var;
    }

    @Override
    public final void run() {
        switch (this.f35087a) {
            case 0:
                mf0 mf0Var = this.f35088b;
                org.telegram.ui.Components.lj0 lj0Var = mf0Var.h;
                lj0Var.getAnimatedDrawable().N(0, false, false);
                lj0Var.d();
                EditTextBoldCursor editTextBoldCursor = mf0Var.f35648b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f35088b.f35648b.requestFocus();
                return;
        }
    }
}
