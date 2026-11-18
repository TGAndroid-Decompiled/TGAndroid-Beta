package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class bb0 implements Runnable {
    public final int f45810a;
    public final oc0 f45811b;

    public bb0(oc0 oc0Var, int i7) {
        this.f45810a = i7;
        this.f45811b = oc0Var;
    }

    @Override
    public final void run() {
        switch (this.f45810a) {
            case 0:
                this.f45811b.N.m();
                return;
            case 1:
                oc0 oc0Var = this.f45811b;
                oc0Var.O = null;
                oc0Var.P = null;
                oc0Var.o(true);
                oc0Var.f50579e.j(null, null, oc0Var.f50580f, null);
                xc xcVar = oc0Var.f50581n;
                org.telegram.ui.Components.mh0 mh0Var = oc0Var.K;
                xcVar.setAnimation(mh0Var);
                mh0Var.M(0);
                oc0Var.M = true;
                return;
            case 2:
                this.f45811b.M = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f45811b.f50578c;
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
