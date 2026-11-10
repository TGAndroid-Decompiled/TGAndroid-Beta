package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class eb0 implements Runnable {
    public final int f45224a;
    public final sc0 f45225b;

    public eb0(sc0 sc0Var, int i7) {
        this.f45224a = i7;
        this.f45225b = sc0Var;
    }

    @Override
    public final void run() {
        switch (this.f45224a) {
            case 0:
                this.f45225b.M.m();
                return;
            case 1:
                sc0 sc0Var = this.f45225b;
                sc0Var.N = null;
                sc0Var.O = null;
                sc0Var.o(true);
                sc0Var.f49822e.j(null, null, sc0Var.f49823f, null);
                yc ycVar = sc0Var.f49824n;
                org.telegram.ui.Components.zg0 zg0Var = sc0Var.J;
                ycVar.setAnimation(zg0Var);
                zg0Var.M(0);
                sc0Var.L = true;
                return;
            case 2:
                this.f45225b.L = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f45225b.f49821c;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    org.telegram.messenger.g0.K3(editTextBoldCursor);
                    return;
                }
                return;
        }
    }
}
