package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class ay implements org.telegram.ui.ActionBar.q1 {
    public final int f45533a;
    public final EditTextBoldCursor f45534b;

    public ay(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f45533a = i7;
        this.f45534b = editTextBoldCursor;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f45533a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f45534b);
                return;
            case 1:
                org.telegram.messenger.g0.v1(this.f45534b);
                return;
            default:
                org.telegram.messenger.g0.v1(this.f45534b);
                return;
        }
    }
}
