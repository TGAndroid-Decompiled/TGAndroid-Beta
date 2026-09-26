package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class f1 implements DialogInterface.OnShowListener {
    public final int f24104a;
    public final EditTextBoldCursor f24105b;

    public f1(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f24104a = i10;
        this.f24105b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f24104a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f24105b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor2 = this.f24105b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new q1(0, this.f24105b));
                return;
            default:
                AndroidUtilities.runOnUIThread(new q1(6, this.f24105b));
                return;
        }
    }
}
