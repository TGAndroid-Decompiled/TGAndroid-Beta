package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hh implements Runnable {
    public final int f33853a;
    public final EditTextBoldCursor f33854b;

    public hh(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f33853a = i10;
        this.f33854b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f33853a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f33854b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f33854b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f33854b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f33854b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f33854b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f33854b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
