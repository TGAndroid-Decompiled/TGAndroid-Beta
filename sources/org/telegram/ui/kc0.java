package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class kc0 implements Runnable {
    public final int f38739a;
    public final wd0 f38740b;

    public kc0(wd0 wd0Var, int i10) {
        this.f38739a = i10;
        this.f38740b = wd0Var;
    }

    @Override
    public final void run() {
        switch (this.f38739a) {
            case 0:
                this.f38740b.L.m();
                return;
            case 1:
                wd0 wd0Var = this.f38740b;
                wd0Var.M = null;
                wd0Var.N = null;
                wd0Var.o(true);
                wd0Var.e.j(null, null, wd0Var.f42945f, null);
                hd hdVar = wd0Var.f42946n;
                org.telegram.ui.Components.bi0 bi0Var = wd0Var.I;
                hdVar.setAnimation(bi0Var);
                bi0Var.M(0);
                wd0Var.K = true;
                return;
            case 2:
                this.f38740b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f38740b.f42944c;
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
