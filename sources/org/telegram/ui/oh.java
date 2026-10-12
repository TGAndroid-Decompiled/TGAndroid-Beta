package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class oh implements Runnable {
    public final int f40715a;
    public final EditTextBoldCursor f40716b;

    public oh(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f40715a = i10;
        this.f40716b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f40715a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f40716b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f40716b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f40716b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f40716b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f40716b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f40716b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
