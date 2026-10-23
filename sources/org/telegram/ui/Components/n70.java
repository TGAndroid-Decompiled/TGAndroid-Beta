package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class n70 implements Runnable {
    public final int f28889a;
    public final EditTextBoldCursor f28890b;

    public n70(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f28889a = i10;
        this.f28890b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f28889a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f28890b);
                return;
            case 1:
                AndroidUtilities.showKeyboard(this.f28890b);
                return;
            case 2:
                AndroidUtilities.showKeyboard(this.f28890b);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f28890b);
                return;
            case 4:
                EditTextBoldCursor editTextBoldCursor = this.f28890b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor2 = this.f28890b;
                editTextBoldCursor2.requestFocus();
                editTextBoldCursor2.setSelection(0, editTextBoldCursor2.length());
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
        }
    }
}
