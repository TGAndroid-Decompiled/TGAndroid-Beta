package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ch implements Runnable {
    public final int f38344a;
    public final EditTextBoldCursor f38345b;

    public ch(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f38344a = i10;
        this.f38345b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f38344a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f38345b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f38345b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f38345b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f38345b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f38345b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f38345b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
