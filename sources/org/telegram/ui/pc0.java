package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class pc0 implements Runnable {
    public final int f48546a;
    public final qc0 f48547b;

    public pc0(qc0 qc0Var, int i3) {
        this.f48546a = i3;
        this.f48547b = qc0Var;
    }

    @Override
    public final void run() {
        switch (this.f48546a) {
            case 0:
                qc0 qc0Var = this.f48547b;
                org.telegram.ui.Components.fh0 fh0Var = qc0Var.h;
                fh0Var.getAnimatedDrawable().N(0, false, false);
                fh0Var.d();
                EditTextBoldCursor editTextBoldCursor = qc0Var.f48850b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor);
                return;
            default:
                this.f48547b.f48850b.requestFocus();
                return;
        }
    }
}
