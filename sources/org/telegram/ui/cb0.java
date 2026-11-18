package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class cb0 implements Runnable {
    public final int f46471a;
    public final pc0 f46472b;

    public cb0(pc0 pc0Var, int i7) {
        this.f46471a = i7;
        this.f46472b = pc0Var;
    }

    @Override
    public final void run() {
        switch (this.f46471a) {
            case 0:
                this.f46472b.N.m();
                return;
            case 1:
                pc0 pc0Var = this.f46472b;
                pc0Var.O = null;
                pc0Var.P = null;
                pc0Var.o(true);
                pc0Var.f50806e.j(null, null, pc0Var.f50807f, null);
                xc xcVar = pc0Var.f50808n;
                org.telegram.ui.Components.mh0 mh0Var = pc0Var.K;
                xcVar.setAnimation(mh0Var);
                mh0Var.M(0);
                pc0Var.M = true;
                return;
            case 2:
                this.f46472b.M = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f46472b.f50805c;
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
