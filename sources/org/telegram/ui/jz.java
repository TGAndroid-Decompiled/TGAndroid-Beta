package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jz implements DialogInterface.OnDismissListener {
    public final int f38373a;
    public final EditTextBoldCursor f38374b;

    public jz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f38373a = i10;
        this.f38374b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38373a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f38374b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f38374b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f38374b);
                return;
        }
    }
}
