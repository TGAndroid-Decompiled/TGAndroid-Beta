package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class og implements Runnable {
    public final int f48284a;
    public final EditTextBoldCursor f48285b;

    public og(EditTextBoldCursor editTextBoldCursor, int i3) {
        this.f48284a = i3;
        this.f48285b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f48284a) {
            case 0:
                org.telegram.messenger.g0.K3(this.f48285b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f48285b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f48285b;
                editTextBoldCursor2.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor2);
                return;
            case 3:
                org.telegram.messenger.g0.K3(this.f48285b);
                return;
            case 4:
                org.telegram.messenger.g0.K3(this.f48285b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f48285b;
                editTextBoldCursor3.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor3);
                return;
        }
    }
}
