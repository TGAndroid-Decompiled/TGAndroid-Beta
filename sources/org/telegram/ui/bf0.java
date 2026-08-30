package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class bf0 implements Runnable {
    public final int f32949a;
    public final df0 f32950b;

    public bf0(df0 df0Var, int i10) {
        this.f32949a = i10;
        this.f32950b = df0Var;
    }

    @Override
    public final void run() {
        switch (this.f32949a) {
            case 0:
                df0 df0Var = this.f32950b;
                org.telegram.ui.Components.jj0 jj0Var = df0Var.h;
                jj0Var.getAnimatedDrawable().L(0, false, false);
                jj0Var.d();
                EditTextBoldCursor editTextBoldCursor = df0Var.f33621b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f32950b.f33621b.requestFocus();
                return;
        }
    }
}
