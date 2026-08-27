package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class iz implements org.telegram.ui.ActionBar.a2 {

    public final int f39187a;

    public final EditTextBoldCursor f39188b;

    public iz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f39187a = i10;
        this.f39188b = editTextBoldCursor;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39187a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f39188b);
                break;
            case 1:
                AndroidUtilities.hideKeyboard(this.f39188b);
                break;
            default:
                AndroidUtilities.hideKeyboard(this.f39188b);
                break;
        }
    }
}
