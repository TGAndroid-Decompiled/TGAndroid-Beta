package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class p1 implements DialogInterface.OnDismissListener {
    public final int f26911a;
    public final EditText f26912b;

    public p1(EditText editText, int i10) {
        this.f26911a = i10;
        this.f26912b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f26911a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f26912b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f26912b);
                return;
        }
    }
}
