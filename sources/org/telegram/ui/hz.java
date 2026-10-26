package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hz implements DialogInterface.OnDismissListener {
    public final int f40107a;
    public final EditTextBoldCursor f40108b;

    public hz(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f40107a = i10;
        this.f40108b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40107a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f40108b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f40108b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f40108b);
                return;
        }
    }
}
