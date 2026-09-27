package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class oh implements Runnable {
    public final int f36209a;
    public final EditTextBoldCursor f36210b;

    public oh(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f36209a = i10;
        this.f36210b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f36209a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f36210b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f36210b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f36210b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f36210b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f36210b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f36210b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
