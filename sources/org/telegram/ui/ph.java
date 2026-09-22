package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ph implements Runnable {
    public final int f36594a;
    public final EditTextBoldCursor f36595b;

    public ph(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f36594a = i10;
        this.f36595b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f36594a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f36595b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f36595b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f36595b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f36595b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f36595b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f36595b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
