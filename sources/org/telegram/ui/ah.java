package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ah implements Runnable {
    public final int f35680a;
    public final EditTextBoldCursor f35681b;

    public ah(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f35680a = i10;
        this.f35681b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f35680a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f35681b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f35681b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f35681b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f35681b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f35681b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f35681b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
