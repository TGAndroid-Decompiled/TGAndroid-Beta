package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class kz implements DialogInterface.OnDismissListener {
    public final int f39089a;
    public final EditTextBoldCursor f39090b;

    public kz(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f39089a = i10;
        this.f39090b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39089a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f39090b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f39090b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f39090b);
                return;
        }
    }
}
