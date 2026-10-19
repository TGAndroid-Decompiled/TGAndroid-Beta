package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fz implements org.telegram.ui.ActionBar.a2 {
    public final int f37143a;
    public final EditTextBoldCursor f37144b;

    public fz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f37143a = i10;
        this.f37144b = editTextBoldCursor;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f37143a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f37144b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f37144b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f37144b);
                return;
        }
    }
}
