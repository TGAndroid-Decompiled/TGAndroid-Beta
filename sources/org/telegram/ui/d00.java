package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class d00 implements DialogInterface.OnDismissListener {
    public final int f35101a;
    public final EditTextBoldCursor f35102b;

    public d00(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f35101a = i10;
        this.f35102b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35101a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f35102b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f35102b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f35102b);
                return;
        }
    }
}
