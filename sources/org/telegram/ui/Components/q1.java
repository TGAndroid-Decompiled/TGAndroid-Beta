package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f28158a;
    public final EditText f28159b;

    public q1(EditText editText, int i10) {
        this.f28158a = i10;
        this.f28159b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f28158a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f28159b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f28159b);
                return;
        }
    }
}
