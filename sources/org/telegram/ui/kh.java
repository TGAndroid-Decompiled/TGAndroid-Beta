package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class kh implements Runnable {
    public final int f38067a;
    public final EditTextBoldCursor f38068b;

    public kh(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f38067a = i10;
        this.f38068b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f38067a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f38068b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f38068b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f38068b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f38068b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f38068b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f38068b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
