package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class f1 implements DialogInterface.OnShowListener {
    public final int f23800a;
    public final EditTextBoldCursor f23801b;

    public f1(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f23800a = i10;
        this.f23801b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f23800a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f23801b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor2 = this.f23801b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new q1(0, this.f23801b));
                return;
            default:
                AndroidUtilities.runOnUIThread(new q1(6, this.f23801b));
                return;
        }
    }
}
