package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hz implements org.telegram.ui.ActionBar.b2 {
    public final int f39073a;
    public final EditTextBoldCursor f39074b;

    public hz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f39073a = i10;
        this.f39074b = editTextBoldCursor;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f39073a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f39074b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f39074b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f39074b);
                return;
        }
    }
}
