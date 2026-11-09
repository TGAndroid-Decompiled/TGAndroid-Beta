package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class cy implements org.telegram.ui.ActionBar.r1 {
    public final int f44770a;
    public final EditTextBoldCursor f44771b;

    public cy(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f44770a = i7;
        this.f44771b = editTextBoldCursor;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f44770a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f44771b);
                return;
            case 1:
                org.telegram.messenger.g0.v1(this.f44771b);
                return;
            default:
                org.telegram.messenger.g0.v1(this.f44771b);
                return;
        }
    }
}
