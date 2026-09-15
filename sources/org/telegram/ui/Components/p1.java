package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class p1 implements DialogInterface.OnDismissListener {
    public final int f26924a;
    public final EditText f26925b;

    public p1(EditText editText, int i10) {
        this.f26924a = i10;
        this.f26925b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f26924a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f26925b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f26925b);
                return;
        }
    }
}
