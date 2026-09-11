package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class g1 implements DialogInterface.OnShowListener {
    public final int f26228a;
    public final EditTextBoldCursor f26229b;

    public g1(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f26228a = i10;
        this.f26229b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f26228a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f26229b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor2 = this.f26229b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new r1(0, this.f26229b));
                return;
            default:
                AndroidUtilities.runOnUIThread(new r1(6, this.f26229b));
                return;
        }
    }
}
