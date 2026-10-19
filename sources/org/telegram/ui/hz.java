package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hz implements DialogInterface.OnDismissListener {
    public final int f37811a;
    public final EditTextBoldCursor f37812b;

    public hz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f37811a = i10;
        this.f37812b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37811a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f37812b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f37812b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f37812b);
                return;
        }
    }
}
