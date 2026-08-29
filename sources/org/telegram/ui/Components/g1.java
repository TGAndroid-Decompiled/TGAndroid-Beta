package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class g1 implements DialogInterface.OnShowListener {
    public final int f28706a;
    public final EditTextBoldCursor f28707b;

    public g1(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f28706a = i10;
        this.f28707b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f28706a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f28707b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor2 = this.f28707b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new s1(0, this.f28707b));
                return;
            default:
                AndroidUtilities.runOnUIThread(new s1(6, this.f28707b));
                return;
        }
    }
}
