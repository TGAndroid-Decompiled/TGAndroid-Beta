package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class q1 implements Runnable {
    public final int f27493a;
    public final EditTextBoldCursor f27494b;

    public q1(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f27493a = i10;
        this.f27494b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f27493a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f27494b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 1:
                AndroidUtilities.showKeyboard(this.f27494b);
                return;
            case 2:
                AndroidUtilities.showKeyboard(this.f27494b);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f27494b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f27494b);
                return;
            case 5:
                AndroidUtilities.showKeyboard(this.f27494b);
                return;
            case 6:
                EditTextBoldCursor editTextBoldCursor2 = this.f27494b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f27494b;
                editTextBoldCursor3.requestFocus();
                editTextBoldCursor3.setSelection(0, editTextBoldCursor3.length());
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
