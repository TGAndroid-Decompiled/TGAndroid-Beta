package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

public final class p1 implements Runnable {

    public final int f31460a;

    public final EditTextBoldCursor f31461b;

    public p1(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f31460a = i10;
        this.f31461b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f31460a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f31461b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                break;
            case 1:
                AndroidUtilities.showKeyboard(this.f31461b);
                break;
            case 2:
                AndroidUtilities.showKeyboard(this.f31461b);
                break;
            case 3:
                AndroidUtilities.showKeyboard(this.f31461b);
                break;
            case 4:
                AndroidUtilities.showKeyboard(this.f31461b);
                break;
            case 5:
                AndroidUtilities.showKeyboard(this.f31461b);
                break;
            case 6:
                EditTextBoldCursor editTextBoldCursor2 = this.f31461b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                break;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f31461b;
                editTextBoldCursor3.requestFocus();
                editTextBoldCursor3.setSelection(0, editTextBoldCursor3.length());
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                break;
        }
    }
}
