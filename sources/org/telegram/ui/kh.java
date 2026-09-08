package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class kh implements Runnable {
    public final int f38094a;
    public final EditTextBoldCursor f38095b;

    public kh(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f38094a = i10;
        this.f38095b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f38094a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f38095b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f38095b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f38095b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f38095b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f38095b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f38095b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
