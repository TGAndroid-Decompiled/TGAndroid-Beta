package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class qc0 implements Runnable {
    public final int f50579a;
    public final rc0 f50580b;

    public qc0(rc0 rc0Var, int i7) {
        this.f50579a = i7;
        this.f50580b = rc0Var;
    }

    @Override
    public final void run() {
        switch (this.f50579a) {
            case 0:
                rc0 rc0Var = this.f50580b;
                org.telegram.ui.Components.fh0 fh0Var = rc0Var.h;
                fh0Var.getAnimatedDrawable().N(0, false, false);
                fh0Var.d();
                EditTextBoldCursor editTextBoldCursor = rc0Var.f50908b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.J3(editTextBoldCursor);
                return;
            default:
                this.f50580b.f50908b.requestFocus();
                return;
        }
    }
}
