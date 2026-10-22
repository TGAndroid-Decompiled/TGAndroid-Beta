package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class r1 implements Runnable {
    public final int f29781a;
    public final EditTextBoldCursor f29782b;

    public r1(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f29781a = i10;
        this.f29782b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f29781a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f29782b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 1:
                AndroidUtilities.showKeyboard(this.f29782b);
                return;
            case 2:
                AndroidUtilities.showKeyboard(this.f29782b);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f29782b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f29782b);
                return;
            case 5:
                EditTextBoldCursor editTextBoldCursor2 = this.f29782b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f29782b;
                editTextBoldCursor3.requestFocus();
                editTextBoldCursor3.setSelection(0, editTextBoldCursor3.length());
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
