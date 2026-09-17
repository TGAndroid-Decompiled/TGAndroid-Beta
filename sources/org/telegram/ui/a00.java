package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class a00 implements DialogInterface.OnDismissListener {
    public final int f31657a;
    public final EditTextBoldCursor f31658b;

    public a00(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f31657a = i10;
        this.f31658b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f31657a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f31658b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f31658b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f31658b);
                return;
        }
    }
}
