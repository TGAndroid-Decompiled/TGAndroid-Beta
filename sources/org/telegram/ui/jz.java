package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jz implements DialogInterface.OnDismissListener {
    public final int f39708a;
    public final EditTextBoldCursor f39709b;

    public jz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f39708a = i10;
        this.f39709b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39708a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f39709b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f39709b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f39709b);
                return;
        }
    }
}
