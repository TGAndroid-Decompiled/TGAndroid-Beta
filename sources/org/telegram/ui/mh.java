package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class mh implements Runnable {
    public final int f35558a;
    public final EditTextBoldCursor f35559b;

    public mh(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f35558a = i10;
        this.f35559b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f35558a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f35559b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f35559b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f35559b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f35559b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f35559b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f35559b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
