package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class df0 implements Runnable {
    public final int f33106a;
    public final ff0 f33107b;

    public df0(ff0 ff0Var, int i10) {
        this.f33106a = i10;
        this.f33107b = ff0Var;
    }

    @Override
    public final void run() {
        switch (this.f33106a) {
            case 0:
                ff0 ff0Var = this.f33107b;
                org.telegram.ui.Components.mj0 mj0Var = ff0Var.h;
                mj0Var.getAnimatedDrawable().N(0, false, false);
                mj0Var.d();
                EditTextBoldCursor editTextBoldCursor = ff0Var.f33656b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f33107b.f33656b.requestFocus();
                return;
        }
    }
}
