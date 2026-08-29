package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class s1 implements Runnable {
    public final int f32435a;
    public final EditTextBoldCursor f32436b;

    public s1(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f32435a = i10;
        this.f32436b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f32435a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f32436b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 1:
                AndroidUtilities.showKeyboard(this.f32436b);
                return;
            case 2:
                AndroidUtilities.showKeyboard(this.f32436b);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f32436b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f32436b);
                return;
            case 5:
                AndroidUtilities.showKeyboard(this.f32436b);
                return;
            case 6:
                EditTextBoldCursor editTextBoldCursor2 = this.f32436b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f32436b;
                editTextBoldCursor3.requestFocus();
                editTextBoldCursor3.setSelection(0, editTextBoldCursor3.length());
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}
