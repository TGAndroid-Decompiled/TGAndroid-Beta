package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hh implements Runnable {
    public final int f37071a;
    public final EditTextBoldCursor f37072b;

    public hh(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f37071a = i10;
        this.f37072b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f37071a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f37072b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f37072b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f37072b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f37072b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f37072b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f37072b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
