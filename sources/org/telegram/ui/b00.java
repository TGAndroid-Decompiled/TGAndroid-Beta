package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class b00 implements org.telegram.ui.ActionBar.z1 {
    public final int f34388a;
    public final EditTextBoldCursor f34389b;

    public b00(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f34388a = i10;
        this.f34389b = editTextBoldCursor;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f34388a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f34389b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f34389b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f34389b);
                return;
        }
    }
}
