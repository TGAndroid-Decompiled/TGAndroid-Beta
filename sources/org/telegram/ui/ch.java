package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ch implements Runnable {
    public final int f35945a;
    public final EditTextBoldCursor f35946b;

    public ch(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f35945a = i10;
        this.f35946b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f35945a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f35946b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f35946b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f35946b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f35946b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f35946b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f35946b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
