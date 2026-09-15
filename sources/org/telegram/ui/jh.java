package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jh implements Runnable {
    public final int f34903a;
    public final EditTextBoldCursor f34904b;

    public jh(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f34903a = i10;
        this.f34904b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f34903a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f34904b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f34904b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f34904b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f34904b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f34904b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f34904b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
