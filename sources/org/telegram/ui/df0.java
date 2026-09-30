package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class df0 implements Runnable {
    public final int f33185a;
    public final ff0 f33186b;

    public df0(ff0 ff0Var, int i10) {
        this.f33185a = i10;
        this.f33186b = ff0Var;
    }

    @Override
    public final void run() {
        switch (this.f33185a) {
            case 0:
                ff0 ff0Var = this.f33186b;
                org.telegram.ui.Components.oj0 oj0Var = ff0Var.h;
                oj0Var.getAnimatedDrawable().N(0, false, false);
                oj0Var.d();
                EditTextBoldCursor editTextBoldCursor = ff0Var.f33742b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f33186b.f33742b.requestFocus();
                return;
        }
    }
}
