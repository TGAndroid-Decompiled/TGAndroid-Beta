package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class bb0 implements Runnable {
    public final int f46002a;
    public final oc0 f46003b;

    public bb0(oc0 oc0Var, int i7) {
        this.f46002a = i7;
        this.f46003b = oc0Var;
    }

    @Override
    public final void run() {
        switch (this.f46002a) {
            case 0:
                this.f46003b.N.m();
                return;
            case 1:
                oc0 oc0Var = this.f46003b;
                oc0Var.O = null;
                oc0Var.P = null;
                oc0Var.o(true);
                oc0Var.f50654e.j(null, null, oc0Var.f50655f, null);
                xc xcVar = oc0Var.f50656n;
                org.telegram.ui.Components.nh0 nh0Var = oc0Var.K;
                xcVar.setAnimation(nh0Var);
                nh0Var.M(0);
                oc0Var.M = true;
                return;
            case 2:
                this.f46003b.M = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f46003b.f50653c;
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
