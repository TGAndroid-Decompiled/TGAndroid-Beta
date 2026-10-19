package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class pe0 implements Runnable {
    public final int f40203a;
    public final re0 f40204b;

    public pe0(re0 re0Var, int i10) {
        this.f40203a = i10;
        this.f40204b = re0Var;
    }

    @Override
    public final void run() {
        switch (this.f40203a) {
            case 0:
                re0 re0Var = this.f40204b;
                org.telegram.ui.Components.xj0 xj0Var = re0Var.h;
                xj0Var.getAnimatedDrawable().N(0, false, false);
                xj0Var.d();
                EditTextBoldCursor editTextBoldCursor = re0Var.f41140b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f40204b.f41140b.requestFocus();
                return;
        }
    }
}
