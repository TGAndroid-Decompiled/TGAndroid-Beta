package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hz implements DialogInterface.OnDismissListener {
    public final int f40104a;
    public final EditTextBoldCursor f40105b;

    public hz(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f40104a = i10;
        this.f40105b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40104a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f40105b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f40105b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f40105b);
                return;
        }
    }
}
