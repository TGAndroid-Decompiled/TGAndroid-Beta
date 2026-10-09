package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class kh implements Runnable {
    public final int f39289a;
    public final EditTextBoldCursor f39290b;

    public kh(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f39289a = i10;
        this.f39290b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f39289a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f39290b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f39290b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f39290b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f39290b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f39290b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f39290b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
