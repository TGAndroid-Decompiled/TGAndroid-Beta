package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;

public final class d1 implements DialogInterface.OnShowListener {

    public final int f27604a;

    public final EditTextBoldCursor f27605b;

    public d1(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f27604a = i10;
        this.f27605b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f27604a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f27605b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                break;
            case 1:
                EditTextBoldCursor editTextBoldCursor2 = this.f27605b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new p1(0, this.f27605b));
                break;
            default:
                AndroidUtilities.runOnUIThread(new p1(6, this.f27605b));
                break;
        }
    }
}
