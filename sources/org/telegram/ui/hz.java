package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hz implements DialogInterface.OnDismissListener {
    public final int f37817a;
    public final EditTextBoldCursor f37818b;

    public hz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f37817a = i10;
        this.f37818b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37817a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f37818b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f37818b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f37818b);
                return;
        }
    }
}
