package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class f1 implements DialogInterface.OnShowListener {
    public final int f24029a;
    public final EditTextBoldCursor f24030b;

    public f1(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f24029a = i10;
        this.f24030b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f24029a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f24030b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor2 = this.f24030b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new q1(0, this.f24030b));
                return;
            default:
                AndroidUtilities.runOnUIThread(new q1(6, this.f24030b));
                return;
        }
    }
}
