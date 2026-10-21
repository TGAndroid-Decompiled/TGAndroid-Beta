package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hz implements DialogInterface.OnDismissListener {
    public final int f37818a;
    public final EditTextBoldCursor f37819b;

    public hz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f37818a = i10;
        this.f37819b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37818a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f37819b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f37819b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f37819b);
                return;
        }
    }
}
