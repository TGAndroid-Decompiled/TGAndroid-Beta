package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class cb0 implements Runnable {
    public final int f46504a;
    public final pc0 f46505b;

    public cb0(pc0 pc0Var, int i7) {
        this.f46504a = i7;
        this.f46505b = pc0Var;
    }

    @Override
    public final void run() {
        switch (this.f46504a) {
            case 0:
                this.f46505b.N.m();
                return;
            case 1:
                pc0 pc0Var = this.f46505b;
                pc0Var.O = null;
                pc0Var.P = null;
                pc0Var.o(true);
                pc0Var.f50851e.j(null, null, pc0Var.f50852f, null);
                xc xcVar = pc0Var.f50853n;
                org.telegram.ui.Components.oh0 oh0Var = pc0Var.K;
                xcVar.setAnimation(oh0Var);
                oh0Var.M(0);
                pc0Var.M = true;
                return;
            case 2:
                this.f46505b.M = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f46505b.f50850c;
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
