package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class kz implements DialogInterface.OnDismissListener {
    public final int f39071a;
    public final EditTextBoldCursor f39072b;

    public kz(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f39071a = i10;
        this.f39072b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39071a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f39072b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f39072b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f39072b);
                return;
        }
    }
}
