package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hh implements Runnable {
    public final int f40006a;
    public final EditTextBoldCursor f40007b;

    public hh(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f40006a = i10;
        this.f40007b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f40006a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f40007b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f40007b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f40007b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f40007b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f40007b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f40007b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
