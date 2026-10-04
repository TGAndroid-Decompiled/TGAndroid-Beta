package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class f1 implements DialogInterface.OnShowListener {
    public final int f26202a;
    public final EditTextBoldCursor f26203b;

    public f1(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f26202a = i10;
        this.f26203b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f26202a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f26203b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor2 = this.f26203b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new q1(0, this.f26203b));
                return;
            default:
                AndroidUtilities.runOnUIThread(new q1(6, this.f26203b));
                return;
        }
    }
}
