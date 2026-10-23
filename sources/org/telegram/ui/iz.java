package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class iz implements org.telegram.ui.ActionBar.z1 {
    public final int f38416a;
    public final EditTextBoldCursor f38417b;

    public iz(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f38416a = i10;
        this.f38417b = editTextBoldCursor;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f38416a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f38417b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f38417b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f38417b);
                return;
        }
    }
}
