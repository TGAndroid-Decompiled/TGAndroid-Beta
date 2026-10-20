package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class pe0 implements Runnable {
    public final int f40200a;
    public final re0 f40201b;

    public pe0(re0 re0Var, int i10) {
        this.f40200a = i10;
        this.f40201b = re0Var;
    }

    @Override
    public final void run() {
        switch (this.f40200a) {
            case 0:
                re0 re0Var = this.f40201b;
                org.telegram.ui.Components.yj0 yj0Var = re0Var.h;
                yj0Var.getAnimatedDrawable().N(0, false, false);
                yj0Var.d();
                EditTextBoldCursor editTextBoldCursor = re0Var.f41138b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f40201b.f41138b.requestFocus();
                return;
        }
    }
}
