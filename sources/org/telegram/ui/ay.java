package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class ay implements org.telegram.ui.ActionBar.q1 {
    public final int f45539a;
    public final EditTextBoldCursor f45540b;

    public ay(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f45539a = i7;
        this.f45540b = editTextBoldCursor;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f45539a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f45540b);
                return;
            case 1:
                org.telegram.messenger.g0.v1(this.f45540b);
                return;
            default:
                org.telegram.messenger.g0.v1(this.f45540b);
                return;
        }
    }
}
