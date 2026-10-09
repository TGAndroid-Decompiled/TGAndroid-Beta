package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class kh implements Runnable {
    public final int f39291a;
    public final EditTextBoldCursor f39292b;

    public kh(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f39291a = i10;
        this.f39292b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f39291a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f39292b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f39292b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f39292b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f39292b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f39292b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f39292b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
