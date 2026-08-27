package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;

public final class o1 implements DialogInterface.OnDismissListener {

    public final int f31137a;

    public final EditText f31138b;

    public o1(EditText editText, int i10) {
        this.f31137a = i10;
        this.f31138b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f31137a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f31138b);
                break;
            default:
                AndroidUtilities.hideKeyboard(this.f31138b);
                break;
        }
    }
}
