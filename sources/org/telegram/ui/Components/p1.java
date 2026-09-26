package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class p1 implements DialogInterface.OnDismissListener {
    public final int f27234a;
    public final EditText f27235b;

    public p1(EditText editText, int i10) {
        this.f27234a = i10;
        this.f27235b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f27234a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f27235b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f27235b);
                return;
        }
    }
}
