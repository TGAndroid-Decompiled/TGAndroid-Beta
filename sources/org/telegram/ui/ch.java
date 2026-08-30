package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ch implements Runnable {
    public final int f33372a;
    public final EditTextBoldCursor f33373b;

    public ch(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f33372a = i10;
        this.f33373b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f33372a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f33373b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f33373b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f33373b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f33373b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f33373b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f33373b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
