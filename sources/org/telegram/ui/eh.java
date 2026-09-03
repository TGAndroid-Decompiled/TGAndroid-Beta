package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class eh implements Runnable {
    public final int f33811a;
    public final EditTextBoldCursor f33812b;

    public eh(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f33811a = i10;
        this.f33812b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f33811a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f33812b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f33812b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f33812b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f33812b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f33812b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f33812b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
