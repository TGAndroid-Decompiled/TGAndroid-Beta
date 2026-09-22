package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class q1 implements Runnable {
    public final int f27223a;
    public final EditTextBoldCursor f27224b;

    public q1(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f27223a = i10;
        this.f27224b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f27223a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f27224b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 1:
                AndroidUtilities.showKeyboard(this.f27224b);
                return;
            case 2:
                AndroidUtilities.showKeyboard(this.f27224b);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f27224b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f27224b);
                return;
            case 5:
                AndroidUtilities.showKeyboard(this.f27224b);
                return;
            case 6:
                EditTextBoldCursor editTextBoldCursor2 = this.f27224b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f27224b;
                editTextBoldCursor3.requestFocus();
                editTextBoldCursor3.setSelection(0, editTextBoldCursor3.length());
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
