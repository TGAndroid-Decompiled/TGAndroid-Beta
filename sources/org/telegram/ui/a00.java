package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class a00 implements DialogInterface.OnDismissListener {
    public final int f31661a;
    public final EditTextBoldCursor f31662b;

    public a00(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f31661a = i10;
        this.f31662b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f31661a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f31662b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f31662b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f31662b);
                return;
        }
    }
}
