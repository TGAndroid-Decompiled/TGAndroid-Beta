package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class qc0 implements Runnable {
    public final int f51437a;
    public final rc0 f51438b;

    public qc0(rc0 rc0Var, int i7) {
        this.f51437a = i7;
        this.f51438b = rc0Var;
    }

    @Override
    public final void run() {
        switch (this.f51437a) {
            case 0:
                rc0 rc0Var = this.f51438b;
                org.telegram.ui.Components.qh0 qh0Var = rc0Var.h;
                qh0Var.getAnimatedDrawable().N(0, false, false);
                qh0Var.d();
                EditTextBoldCursor editTextBoldCursor = rc0Var.f51692b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.I3(editTextBoldCursor);
                return;
            default:
                this.f51438b.f51692b.requestFocus();
                return;
        }
    }
}
