package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class cz implements org.telegram.ui.ActionBar.u1 {
    public final int f36572a;
    public final EditTextBoldCursor f36573b;

    public cz(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f36572a = i10;
        this.f36573b = editTextBoldCursor;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f36572a) {
            case 0:
                org.telegram.messenger.i0.v1(this.f36573b);
                return;
            case 1:
                org.telegram.messenger.i0.v1(this.f36573b);
                return;
            default:
                org.telegram.messenger.i0.v1(this.f36573b);
                return;
        }
    }
}
