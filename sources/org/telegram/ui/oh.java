package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class oh implements Runnable {
    public final int f38651a;
    public final EditTextBoldCursor f38652b;

    public oh(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f38651a = i10;
        this.f38652b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f38651a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f38652b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f38652b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f38652b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f38652b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f38652b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f38652b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
