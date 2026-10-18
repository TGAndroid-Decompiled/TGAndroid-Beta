package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ch implements Runnable {
    public final int f35958a;
    public final EditTextBoldCursor f35959b;

    public ch(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f35958a = i10;
        this.f35959b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f35958a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f35959b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f35959b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f35959b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f35959b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f35959b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f35959b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
