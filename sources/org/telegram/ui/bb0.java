package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class bb0 implements Runnable {
    public final int f45664a;
    public final oc0 f45665b;

    public bb0(oc0 oc0Var, int i7) {
        this.f45664a = i7;
        this.f45665b = oc0Var;
    }

    @Override
    public final void run() {
        switch (this.f45664a) {
            case 0:
                this.f45665b.N.m();
                return;
            case 1:
                oc0 oc0Var = this.f45665b;
                oc0Var.O = null;
                oc0Var.P = null;
                oc0Var.o(true);
                oc0Var.f49909e.j(null, null, oc0Var.f49910f, null);
                xc xcVar = oc0Var.f49911n;
                org.telegram.ui.Components.ch0 ch0Var = oc0Var.K;
                xcVar.setAnimation(ch0Var);
                ch0Var.M(0);
                oc0Var.M = true;
                return;
            case 2:
                this.f45665b.M = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f45665b.f49908c;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    org.telegram.messenger.g0.J3(editTextBoldCursor);
                    return;
                }
                return;
        }
    }
}
