package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class a00 implements DialogInterface.OnDismissListener {
    public final int f35638a;
    public final EditTextBoldCursor f35639b;

    public a00(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f35638a = i10;
        this.f35639b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35638a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f35639b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f35639b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f35639b);
                return;
        }
    }
}
