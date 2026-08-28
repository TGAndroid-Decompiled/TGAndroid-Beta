package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hz implements DialogInterface.OnDismissListener {
    public final int f38960a;
    public final EditTextBoldCursor f38961b;

    public hz(int i9, EditTextBoldCursor editTextBoldCursor) {
        this.f38960a = i9;
        this.f38961b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38960a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f38961b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f38961b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f38961b);
                return;
        }
    }
}
