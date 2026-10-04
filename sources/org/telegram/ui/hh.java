package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hh implements Runnable {
    public final int f37072a;
    public final EditTextBoldCursor f37073b;

    public hh(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f37072a = i10;
        this.f37073b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f37072a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f37073b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f37073b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f37073b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f37073b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f37073b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f37073b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
