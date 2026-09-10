package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class a00 implements DialogInterface.OnDismissListener {
    public final int f30759a;
    public final EditTextBoldCursor f30760b;

    public a00(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f30759a = i10;
        this.f30760b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f30759a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f30760b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f30760b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f30760b);
                return;
        }
    }
}
