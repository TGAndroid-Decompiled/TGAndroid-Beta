package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class h1 implements DialogInterface.OnShowListener {
    public final int f23466a;
    public final EditTextBoldCursor f23467b;

    public h1(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f23466a = i10;
        this.f23467b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f23466a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f23467b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor2 = this.f23467b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new s1(0, this.f23467b));
                return;
            default:
                AndroidUtilities.runOnUIThread(new s1(6, this.f23467b));
                return;
        }
    }
}
