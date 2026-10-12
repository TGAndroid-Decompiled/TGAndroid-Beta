package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class f1 implements DialogInterface.OnShowListener {
    public final int f24847a;
    public final EditTextBoldCursor f24848b;

    public f1(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f24847a = i10;
        this.f24848b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f24847a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f24848b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor2 = this.f24848b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new r1(0, this.f24848b));
                return;
            default:
                AndroidUtilities.runOnUIThread(new r1(5, this.f24848b));
                return;
        }
    }
}
