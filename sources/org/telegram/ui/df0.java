package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class df0 implements Runnable {
    public final int f33107a;
    public final ff0 f33108b;

    public df0(ff0 ff0Var, int i10) {
        this.f33107a = i10;
        this.f33108b = ff0Var;
    }

    @Override
    public final void run() {
        switch (this.f33107a) {
            case 0:
                ff0 ff0Var = this.f33108b;
                org.telegram.ui.Components.lj0 lj0Var = ff0Var.h;
                lj0Var.getAnimatedDrawable().N(0, false, false);
                lj0Var.d();
                EditTextBoldCursor editTextBoldCursor = ff0Var.f33657b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f33108b.f33657b.requestFocus();
                return;
        }
    }
}
