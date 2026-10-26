package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class o70 implements Runnable {
    public final int f31220a;
    public final EditTextBoldCursor f31221b;

    public o70(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f31220a = i10;
        this.f31221b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f31220a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f31221b);
                return;
            case 1:
                AndroidUtilities.showKeyboard(this.f31221b);
                return;
            case 2:
                AndroidUtilities.showKeyboard(this.f31221b);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f31221b);
                return;
            case 4:
                EditTextBoldCursor editTextBoldCursor = this.f31221b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor2 = this.f31221b;
                editTextBoldCursor2.requestFocus();
                editTextBoldCursor2.setSelection(0, editTextBoldCursor2.length());
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
        }
    }
}
