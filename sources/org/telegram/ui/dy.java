package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class dy implements org.telegram.ui.ActionBar.q1 {
    public final int f47254a;
    public final EditTextBoldCursor f47255b;

    public dy(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f47254a = i7;
        this.f47255b = editTextBoldCursor;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f47254a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f47255b);
                return;
            case 1:
                org.telegram.messenger.g0.v1(this.f47255b);
                return;
            default:
                org.telegram.messenger.g0.v1(this.f47255b);
                return;
        }
    }
}
