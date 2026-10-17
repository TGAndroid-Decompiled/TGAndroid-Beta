package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jz implements DialogInterface.OnDismissListener {
    public final int f38364a;
    public final EditTextBoldCursor f38365b;

    public jz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f38364a = i10;
        this.f38365b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38364a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f38365b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f38365b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f38365b);
                return;
        }
    }
}
