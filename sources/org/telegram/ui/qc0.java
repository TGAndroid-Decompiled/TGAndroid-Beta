package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class qc0 implements Runnable {
    public final int f51237a;
    public final rc0 f51238b;

    public qc0(rc0 rc0Var, int i7) {
        this.f51237a = i7;
        this.f51238b = rc0Var;
    }

    @Override
    public final void run() {
        switch (this.f51237a) {
            case 0:
                rc0 rc0Var = this.f51238b;
                org.telegram.ui.Components.ph0 ph0Var = rc0Var.h;
                ph0Var.getAnimatedDrawable().N(0, false, false);
                ph0Var.d();
                EditTextBoldCursor editTextBoldCursor = rc0Var.f51567b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.I3(editTextBoldCursor);
                return;
            default:
                this.f51238b.f51567b.requestFocus();
                return;
        }
    }
}
