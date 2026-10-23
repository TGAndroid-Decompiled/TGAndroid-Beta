package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ah implements Runnable {
    public final int f35380a;
    public final EditTextBoldCursor f35381b;

    public ah(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f35380a = i10;
        this.f35381b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f35380a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f35381b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f35381b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f35381b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f35381b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f35381b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f35381b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
