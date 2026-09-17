package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class g1 implements DialogInterface.OnShowListener {
    public final int f26229a;
    public final EditTextBoldCursor f26230b;

    public g1(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f26229a = i10;
        this.f26230b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f26229a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f26230b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor2 = this.f26230b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new r1(0, this.f26230b));
                return;
            default:
                AndroidUtilities.runOnUIThread(new r1(6, this.f26230b));
                return;
        }
    }
}
