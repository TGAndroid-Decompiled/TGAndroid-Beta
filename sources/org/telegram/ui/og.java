package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class og implements Runnable {
    public final int f49945a;
    public final EditTextBoldCursor f49946b;

    public og(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f49945a = i7;
        this.f49946b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f49945a) {
            case 0:
                org.telegram.messenger.g0.J3(this.f49946b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f49946b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.J3(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f49946b;
                editTextBoldCursor2.requestFocus();
                org.telegram.messenger.g0.J3(editTextBoldCursor2);
                return;
            case 3:
                org.telegram.messenger.g0.J3(this.f49946b);
                return;
            case 4:
                org.telegram.messenger.g0.J3(this.f49946b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f49946b;
                editTextBoldCursor3.requestFocus();
                org.telegram.messenger.g0.J3(editTextBoldCursor3);
                return;
        }
    }
}
