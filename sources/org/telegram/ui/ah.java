package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ah implements Runnable {
    public final int f35379a;
    public final EditTextBoldCursor f35380b;

    public ah(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f35379a = i10;
        this.f35380b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f35379a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f35380b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f35380b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f35380b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f35380b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f35380b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f35380b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
