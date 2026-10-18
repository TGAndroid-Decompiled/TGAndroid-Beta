package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jz implements DialogInterface.OnDismissListener {
    public final int f38358a;
    public final EditTextBoldCursor f38359b;

    public jz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f38358a = i10;
        this.f38359b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38358a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f38359b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f38359b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f38359b);
                return;
        }
    }
}
