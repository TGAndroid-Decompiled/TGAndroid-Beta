package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class p1 implements DialogInterface.OnDismissListener {
    public final int f27707a;
    public final EditText f27708b;

    public p1(EditText editText, int i10) {
        this.f27707a = i10;
        this.f27708b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f27707a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f27708b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f27708b);
                return;
        }
    }
}
