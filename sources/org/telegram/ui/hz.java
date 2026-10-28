package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hz implements org.telegram.ui.ActionBar.b2 {
    public final int f40011a;
    public final EditTextBoldCursor f40012b;

    public hz(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f40011a = i10;
        this.f40012b = editTextBoldCursor;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f40011a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f40012b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f40012b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f40012b);
                return;
        }
    }
}
