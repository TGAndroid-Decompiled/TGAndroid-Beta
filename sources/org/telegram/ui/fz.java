package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fz implements org.telegram.ui.ActionBar.b2 {
    public final int f39496a;
    public final EditTextBoldCursor f39497b;

    public fz(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f39496a = i10;
        this.f39497b = editTextBoldCursor;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f39496a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f39497b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f39497b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f39497b);
                return;
        }
    }
}
