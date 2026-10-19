package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class pe0 implements Runnable {
    public final int f40194a;
    public final re0 f40195b;

    public pe0(re0 re0Var, int i10) {
        this.f40194a = i10;
        this.f40195b = re0Var;
    }

    @Override
    public final void run() {
        switch (this.f40194a) {
            case 0:
                re0 re0Var = this.f40195b;
                org.telegram.ui.Components.xj0 xj0Var = re0Var.h;
                xj0Var.getAnimatedDrawable().N(0, false, false);
                xj0Var.d();
                EditTextBoldCursor editTextBoldCursor = re0Var.f41132b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f40195b.f41132b.requestFocus();
                return;
        }
    }
}
