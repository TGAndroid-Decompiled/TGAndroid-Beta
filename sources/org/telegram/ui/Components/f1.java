package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class f1 implements DialogInterface.OnShowListener {
    public final int f26015a;
    public final EditTextBoldCursor f26016b;

    public f1(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f26015a = i10;
        this.f26016b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f26015a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f26016b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor2 = this.f26016b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new r1(0, this.f26016b));
                return;
            default:
                AndroidUtilities.runOnUIThread(new r1(5, this.f26016b));
                return;
        }
    }
}
