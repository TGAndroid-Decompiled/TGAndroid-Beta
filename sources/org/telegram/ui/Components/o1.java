package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class o1 implements DialogInterface.OnDismissListener {
    public final int f31250a;
    public final EditText f31251b;

    public o1(EditText editText, int i9) {
        this.f31250a = i9;
        this.f31251b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f31250a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f31251b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f31251b);
                return;
        }
    }
}
