package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class bz implements org.telegram.ui.ActionBar.u1 {
    public final int f36133a;
    public final EditTextBoldCursor f36134b;

    public bz(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f36133a = i10;
        this.f36134b = editTextBoldCursor;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f36133a) {
            case 0:
                org.telegram.messenger.i0.v1(this.f36134b);
                return;
            case 1:
                org.telegram.messenger.i0.v1(this.f36134b);
                return;
            default:
                org.telegram.messenger.i0.v1(this.f36134b);
                return;
        }
    }
}
