package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hz implements org.telegram.ui.ActionBar.a2 {
    public final int f37708a;
    public final EditTextBoldCursor f37709b;

    public hz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f37708a = i10;
        this.f37709b = editTextBoldCursor;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f37708a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f37709b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f37709b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f37709b);
                return;
        }
    }
}
