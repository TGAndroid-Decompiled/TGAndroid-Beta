package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ef0 implements Runnable {
    public final int f32912a;
    public final gf0 f32913b;

    public ef0(gf0 gf0Var, int i10) {
        this.f32912a = i10;
        this.f32913b = gf0Var;
    }

    @Override
    public final void run() {
        switch (this.f32912a) {
            case 0:
                gf0 gf0Var = this.f32913b;
                org.telegram.ui.Components.bj0 bj0Var = gf0Var.h;
                bj0Var.getAnimatedDrawable().N(0, false, false);
                bj0Var.d();
                EditTextBoldCursor editTextBoldCursor = gf0Var.f33547b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f32913b.f33547b.requestFocus();
                return;
        }
    }
}
