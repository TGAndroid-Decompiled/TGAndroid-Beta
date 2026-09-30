package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class mh implements Runnable {
    public final int f35648a;
    public final EditTextBoldCursor f35649b;

    public mh(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f35648a = i10;
        this.f35649b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f35648a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f35649b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f35649b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f35649b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f35649b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f35649b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f35649b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
