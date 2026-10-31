package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class bh implements Runnable {
    public final int f36260a;
    public final EditTextBoldCursor f36261b;

    public bh(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f36260a = i10;
        this.f36261b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f36260a) {
            case 0:
                org.telegram.messenger.i0.J3(this.f36261b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f36261b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.i0.J3(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f36261b;
                editTextBoldCursor2.requestFocus();
                org.telegram.messenger.i0.J3(editTextBoldCursor2);
                return;
            case 3:
                org.telegram.messenger.i0.J3(this.f36261b);
                return;
            case 4:
                org.telegram.messenger.i0.J3(this.f36261b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f36261b;
                editTextBoldCursor3.requestFocus();
                org.telegram.messenger.i0.J3(editTextBoldCursor3);
                return;
        }
    }
}
