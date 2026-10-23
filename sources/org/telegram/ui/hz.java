package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hz implements DialogInterface.OnDismissListener {
    public final int f37822a;
    public final EditTextBoldCursor f37823b;

    public hz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f37822a = i10;
        this.f37823b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37822a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f37823b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f37823b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f37823b);
                return;
        }
    }
}
