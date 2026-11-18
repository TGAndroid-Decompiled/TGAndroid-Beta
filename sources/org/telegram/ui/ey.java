package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class ey implements org.telegram.ui.ActionBar.r1 {
    public final int f47382a;
    public final EditTextBoldCursor f47383b;

    public ey(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f47382a = i7;
        this.f47383b = editTextBoldCursor;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f47382a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f47383b);
                return;
            case 1:
                org.telegram.messenger.g0.v1(this.f47383b);
                return;
            default:
                org.telegram.messenger.g0.v1(this.f47383b);
                return;
        }
    }
}
