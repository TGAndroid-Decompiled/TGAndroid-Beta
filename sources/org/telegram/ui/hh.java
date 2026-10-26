package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hh implements Runnable {
    public final int f40009a;
    public final EditTextBoldCursor f40010b;

    public hh(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f40009a = i10;
        this.f40010b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f40009a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f40010b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f40010b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f40010b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f40010b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f40010b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f40010b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
