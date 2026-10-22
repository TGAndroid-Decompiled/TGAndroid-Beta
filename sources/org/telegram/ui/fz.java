package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fz implements org.telegram.ui.ActionBar.a2 {
    public final int f37147a;
    public final EditTextBoldCursor f37148b;

    public fz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f37147a = i10;
        this.f37148b = editTextBoldCursor;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f37147a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f37148b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f37148b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f37148b);
                return;
        }
    }
}
