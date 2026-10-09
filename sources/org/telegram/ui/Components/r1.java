package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class r1 implements Runnable {
    public final int f30330a;
    public final EditTextBoldCursor f30331b;

    public r1(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f30330a = i10;
        this.f30331b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f30330a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f30331b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 1:
                AndroidUtilities.showKeyboard(this.f30331b);
                return;
            case 2:
                AndroidUtilities.showKeyboard(this.f30331b);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f30331b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f30331b);
                return;
            case 5:
                EditTextBoldCursor editTextBoldCursor2 = this.f30331b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f30331b;
                editTextBoldCursor3.requestFocus();
                editTextBoldCursor3.setSelection(0, editTextBoldCursor3.length());
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
