package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class qg implements Runnable {
    public final int f51280a;
    public final EditTextBoldCursor f51281b;

    public qg(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f51280a = i7;
        this.f51281b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f51280a) {
            case 0:
                org.telegram.messenger.g0.I3(this.f51281b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f51281b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.I3(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f51281b;
                editTextBoldCursor2.requestFocus();
                org.telegram.messenger.g0.I3(editTextBoldCursor2);
                return;
            case 3:
                org.telegram.messenger.g0.I3(this.f51281b);
                return;
            case 4:
                org.telegram.messenger.g0.I3(this.f51281b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f51281b;
                editTextBoldCursor3.requestFocus();
                org.telegram.messenger.g0.I3(editTextBoldCursor3);
                return;
        }
    }
}
