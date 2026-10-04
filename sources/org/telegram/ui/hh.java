package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hh implements Runnable {
    public final int f37077a;
    public final EditTextBoldCursor f37078b;

    public hh(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f37077a = i10;
        this.f37078b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f37077a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f37078b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f37078b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f37078b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f37078b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f37078b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f37078b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
