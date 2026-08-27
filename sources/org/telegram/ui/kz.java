package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class kz implements DialogInterface.OnDismissListener {

    public final int f39904a;

    public final EditTextBoldCursor f39905b;

    public kz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f39904a = i10;
        this.f39905b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39904a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f39905b);
                break;
            case 1:
                AndroidUtilities.hideKeyboard(this.f39905b);
                break;
            default:
                AndroidUtilities.hideKeyboard(this.f39905b);
                break;
        }
    }
}
