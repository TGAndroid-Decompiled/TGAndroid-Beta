package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class e1 implements DialogInterface.OnShowListener {
    public final int f26413a;
    public final EditTextBoldCursor f26414b;

    public e1(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f26413a = i10;
        this.f26414b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f26413a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f26414b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor2 = this.f26414b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new q1(0, this.f26414b));
                return;
            default:
                AndroidUtilities.runOnUIThread(new q1(6, this.f26414b));
                return;
        }
    }
}
