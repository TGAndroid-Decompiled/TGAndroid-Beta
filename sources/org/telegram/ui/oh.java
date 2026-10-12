package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class oh implements Runnable {
    public final int f38955a;
    public final EditTextBoldCursor f38956b;

    public oh(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f38955a = i10;
        this.f38956b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f38955a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f38956b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f38956b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f38956b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f38956b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f38956b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f38956b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
