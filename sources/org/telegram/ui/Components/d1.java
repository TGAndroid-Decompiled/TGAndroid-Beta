package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class d1 implements DialogInterface.OnShowListener {
    public final int f27624a;
    public final EditTextBoldCursor f27625b;

    public d1(int i9, EditTextBoldCursor editTextBoldCursor) {
        this.f27624a = i9;
        this.f27625b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f27624a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f27625b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor2 = this.f27625b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new p1(0, this.f27625b));
                return;
            default:
                AndroidUtilities.runOnUIThread(new p1(6, this.f27625b));
                return;
        }
    }
}
