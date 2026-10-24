package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class l70 implements Runnable {
    public final int f28242a;
    public final EditTextBoldCursor f28243b;

    public l70(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f28242a = i10;
        this.f28243b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f28242a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f28243b);
                return;
            case 1:
                AndroidUtilities.showKeyboard(this.f28243b);
                return;
            case 2:
                AndroidUtilities.showKeyboard(this.f28243b);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f28243b);
                return;
            case 4:
                EditTextBoldCursor editTextBoldCursor = this.f28243b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor2 = this.f28243b;
                editTextBoldCursor2.requestFocus();
                editTextBoldCursor2.setSelection(0, editTextBoldCursor2.length());
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
        }
    }
}
