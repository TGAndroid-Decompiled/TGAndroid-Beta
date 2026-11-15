package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class bb0 implements Runnable {
    public final int f45670a;
    public final oc0 f45671b;

    public bb0(oc0 oc0Var, int i7) {
        this.f45670a = i7;
        this.f45671b = oc0Var;
    }

    @Override
    public final void run() {
        switch (this.f45670a) {
            case 0:
                this.f45671b.N.m();
                return;
            case 1:
                oc0 oc0Var = this.f45671b;
                oc0Var.O = null;
                oc0Var.P = null;
                oc0Var.o(true);
                oc0Var.f49919e.j(null, null, oc0Var.f49920f, null);
                xc xcVar = oc0Var.f49921n;
                org.telegram.ui.Components.ch0 ch0Var = oc0Var.K;
                xcVar.setAnimation(ch0Var);
                ch0Var.M(0);
                oc0Var.M = true;
                return;
            case 2:
                this.f45671b.M = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f45671b.f49918c;
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
