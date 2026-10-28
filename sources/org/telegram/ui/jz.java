package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jz implements DialogInterface.OnDismissListener {
    public final int f40630a;
    public final EditTextBoldCursor f40631b;

    public jz(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f40630a = i10;
        this.f40631b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40630a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f40631b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f40631b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f40631b);
                return;
        }
    }
}
