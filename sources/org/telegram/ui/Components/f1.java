package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class f1 implements DialogInterface.OnShowListener {
    public final int f26240a;
    public final EditTextBoldCursor f26241b;

    public f1(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f26240a = i10;
        this.f26241b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f26240a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f26241b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor2 = this.f26241b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new r1(0, this.f26241b));
                return;
            default:
                AndroidUtilities.runOnUIThread(new r1(5, this.f26241b));
                return;
        }
    }
}
