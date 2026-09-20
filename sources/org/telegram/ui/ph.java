package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ph implements Runnable {
    public final int f36567a;
    public final EditTextBoldCursor f36568b;

    public ph(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f36567a = i10;
        this.f36568b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f36567a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f36568b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f36568b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f36568b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f36568b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f36568b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f36568b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
