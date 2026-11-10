package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class dy implements org.telegram.ui.ActionBar.r1 {
    public final int f45068a;
    public final EditTextBoldCursor f45069b;

    public dy(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f45068a = i7;
        this.f45069b = editTextBoldCursor;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f45068a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f45069b);
                return;
            case 1:
                org.telegram.messenger.g0.v1(this.f45069b);
                return;
            default:
                org.telegram.messenger.g0.v1(this.f45069b);
                return;
        }
    }
}
