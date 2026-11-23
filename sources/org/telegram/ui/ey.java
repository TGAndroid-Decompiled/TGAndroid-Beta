package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class ey implements org.telegram.ui.ActionBar.q1 {
    public final int f47372a;
    public final EditTextBoldCursor f47373b;

    public ey(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f47372a = i7;
        this.f47373b = editTextBoldCursor;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f47372a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f47373b);
                return;
            case 1:
                org.telegram.messenger.g0.v1(this.f47373b);
                return;
            default:
                org.telegram.messenger.g0.v1(this.f47373b);
                return;
        }
    }
}
