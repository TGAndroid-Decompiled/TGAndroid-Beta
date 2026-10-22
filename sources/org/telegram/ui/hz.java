package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hz implements DialogInterface.OnDismissListener {
    public final int f37821a;
    public final EditTextBoldCursor f37822b;

    public hz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f37821a = i10;
        this.f37822b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37821a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f37822b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f37822b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f37822b);
                return;
        }
    }
}
