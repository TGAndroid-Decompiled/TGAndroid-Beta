package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fz implements org.telegram.ui.ActionBar.b2 {
    public final int f38377a;
    public final EditTextBoldCursor f38378b;

    public fz(int i9, EditTextBoldCursor editTextBoldCursor) {
        this.f38377a = i9;
        this.f38378b = editTextBoldCursor;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f38377a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f38378b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f38378b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f38378b);
                return;
        }
    }
}
