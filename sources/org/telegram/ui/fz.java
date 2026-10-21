package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fz implements org.telegram.ui.ActionBar.a2 {
    public final int f37144a;
    public final EditTextBoldCursor f37145b;

    public fz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f37144a = i10;
        this.f37145b = editTextBoldCursor;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f37144a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f37145b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f37145b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f37145b);
                return;
        }
    }
}
