package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class ah implements Runnable {

    public final int f36534a;

    public final EditTextBoldCursor f36535b;

    public ah(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f36534a = i10;
        this.f36535b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f36534a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f36535b);
                break;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f36535b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                break;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f36535b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                break;
            case 3:
                AndroidUtilities.showKeyboard(this.f36535b);
                break;
            case 4:
                AndroidUtilities.showKeyboard(this.f36535b);
                break;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f36535b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                break;
        }
    }
}
