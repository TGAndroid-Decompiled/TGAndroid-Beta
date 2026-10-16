package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class d00 implements DialogInterface.OnDismissListener {
    public final int f34821a;
    public final EditTextBoldCursor f34822b;

    public d00(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f34821a = i10;
        this.f34822b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f34821a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f34822b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f34822b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f34822b);
                return;
        }
    }
}
