package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class f1 implements DialogInterface.OnShowListener {
    public final int f24030a;
    public final EditTextBoldCursor f24031b;

    public f1(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f24030a = i10;
        this.f24031b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f24030a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f24031b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor2 = this.f24031b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new q1(0, this.f24031b));
                return;
            default:
                AndroidUtilities.runOnUIThread(new q1(6, this.f24031b));
                return;
        }
    }
}
