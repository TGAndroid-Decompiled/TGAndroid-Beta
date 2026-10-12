package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class a00 implements DialogInterface.OnDismissListener {
    public final int f35640a;
    public final EditTextBoldCursor f35641b;

    public a00(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f35640a = i10;
        this.f35641b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35640a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f35641b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f35641b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f35641b);
                return;
        }
    }
}
