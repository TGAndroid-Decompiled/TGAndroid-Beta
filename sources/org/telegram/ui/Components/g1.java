package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class g1 implements DialogInterface.OnShowListener {
    public final int f26255a;
    public final EditTextBoldCursor f26256b;

    public g1(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f26255a = i10;
        this.f26256b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f26255a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f26256b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor2 = this.f26256b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new r1(0, this.f26256b));
                return;
            default:
                AndroidUtilities.runOnUIThread(new r1(6, this.f26256b));
                return;
        }
    }
}
