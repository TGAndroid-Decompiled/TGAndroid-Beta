package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ah implements Runnable {
    public final int f35375a;
    public final EditTextBoldCursor f35376b;

    public ah(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f35375a = i10;
        this.f35376b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f35375a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f35376b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f35376b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f35376b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f35376b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f35376b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f35376b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
