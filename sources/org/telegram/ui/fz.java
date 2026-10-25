package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fz implements org.telegram.ui.ActionBar.b2 {
    public final int f39493a;
    public final EditTextBoldCursor f39494b;

    public fz(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f39493a = i10;
        this.f39494b = editTextBoldCursor;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f39493a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f39494b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f39494b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f39494b);
                return;
        }
    }
}
