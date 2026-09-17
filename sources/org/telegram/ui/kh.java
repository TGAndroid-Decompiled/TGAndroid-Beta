package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class kh implements Runnable {
    public final int f38095a;
    public final EditTextBoldCursor f38096b;

    public kh(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f38095a = i10;
        this.f38096b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f38095a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f38096b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f38096b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f38096b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f38096b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f38096b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f38096b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
