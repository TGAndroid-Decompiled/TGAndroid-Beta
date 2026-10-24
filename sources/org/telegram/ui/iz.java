package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class iz implements org.telegram.ui.ActionBar.z1 {
    public final int f38409a;
    public final EditTextBoldCursor f38410b;

    public iz(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f38409a = i10;
        this.f38410b = editTextBoldCursor;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f38409a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f38410b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f38410b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f38410b);
                return;
        }
    }
}
