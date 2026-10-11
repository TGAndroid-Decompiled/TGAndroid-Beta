package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class kh implements Runnable {
    public final int f39372a;
    public final EditTextBoldCursor f39373b;

    public kh(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f39372a = i10;
        this.f39373b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f39372a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f39373b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f39373b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f39373b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f39373b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f39373b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f39373b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
