package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class mh implements Runnable {
    public final int f35546a;
    public final EditTextBoldCursor f35547b;

    public mh(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f35546a = i10;
        this.f35547b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f35546a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f35547b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f35547b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f35547b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f35547b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f35547b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f35547b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
