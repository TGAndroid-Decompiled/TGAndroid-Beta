package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ah implements Runnable {
    public final int f35778a;
    public final EditTextBoldCursor f35779b;

    public ah(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f35778a = i10;
        this.f35779b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f35778a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f35779b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f35779b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f35779b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f35779b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f35779b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f35779b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
