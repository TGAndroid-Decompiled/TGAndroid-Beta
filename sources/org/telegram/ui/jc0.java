package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class jc0 implements Runnable {
    public final int f38360a;
    public final vd0 f38361b;

    public jc0(vd0 vd0Var, int i10) {
        this.f38360a = i10;
        this.f38361b = vd0Var;
    }

    @Override
    public final void run() {
        switch (this.f38360a) {
            case 0:
                this.f38361b.L.m();
                return;
            case 1:
                vd0 vd0Var = this.f38361b;
                vd0Var.M = null;
                vd0Var.N = null;
                vd0Var.o(true);
                vd0Var.e.j(null, null, vd0Var.f42496f, null);
                hd hdVar = vd0Var.f42497n;
                org.telegram.ui.Components.ci0 ci0Var = vd0Var.I;
                hdVar.setAnimation(ci0Var);
                ci0Var.M(0);
                vd0Var.K = true;
                return;
            case 2:
                this.f38361b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f38361b.f42495c;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    org.telegram.messenger.i0.J3(editTextBoldCursor);
                    return;
                }
                return;
        }
    }
}
