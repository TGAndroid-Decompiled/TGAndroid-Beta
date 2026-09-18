package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class f1 implements DialogInterface.OnShowListener {
    public final int f23726a;
    public final EditTextBoldCursor f23727b;

    public f1(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f23726a = i10;
        this.f23727b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f23726a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f23727b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor2 = this.f23727b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new q1(0, this.f23727b));
                return;
            default:
                AndroidUtilities.runOnUIThread(new q1(6, this.f23727b));
                return;
        }
    }
}
