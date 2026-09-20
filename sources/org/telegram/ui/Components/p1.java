package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class p1 implements DialogInterface.OnDismissListener {
    public final int f27109a;
    public final EditText f27110b;

    public p1(EditText editText, int i10) {
        this.f27109a = i10;
        this.f27110b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f27109a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f27110b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f27110b);
                return;
        }
    }
}
