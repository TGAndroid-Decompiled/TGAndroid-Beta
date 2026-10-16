package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class b00 implements org.telegram.ui.ActionBar.z1 {
    public final int f34136a;
    public final EditTextBoldCursor f34137b;

    public b00(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f34136a = i10;
        this.f34137b = editTextBoldCursor;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f34136a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f34137b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f34137b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f34137b);
                return;
        }
    }
}
