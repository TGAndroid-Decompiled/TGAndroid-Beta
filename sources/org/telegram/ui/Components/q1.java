package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f31786a;
    public final EditText f31787b;

    public q1(EditText editText, int i10) {
        this.f31786a = i10;
        this.f31787b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f31786a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f31787b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f31787b);
                return;
        }
    }
}
