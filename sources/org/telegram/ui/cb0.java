package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class cb0 implements Runnable {
    public final int f46501a;
    public final pc0 f46502b;

    public cb0(pc0 pc0Var, int i7) {
        this.f46501a = i7;
        this.f46502b = pc0Var;
    }

    @Override
    public final void run() {
        switch (this.f46501a) {
            case 0:
                this.f46502b.N.m();
                return;
            case 1:
                pc0 pc0Var = this.f46502b;
                pc0Var.O = null;
                pc0Var.P = null;
                pc0Var.o(true);
                pc0Var.f50847e.j(null, null, pc0Var.f50848f, null);
                xc xcVar = pc0Var.f50849n;
                org.telegram.ui.Components.oh0 oh0Var = pc0Var.K;
                xcVar.setAnimation(oh0Var);
                oh0Var.M(0);
                pc0Var.M = true;
                return;
            case 2:
                this.f46502b.M = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f46502b.f50846c;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    org.telegram.messenger.g0.I3(editTextBoldCursor);
                    return;
                }
                return;
        }
    }
}
