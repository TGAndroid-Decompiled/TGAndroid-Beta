package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f31784a;
    public final EditText f31785b;

    public q1(EditText editText, int i10) {
        this.f31784a = i10;
        this.f31785b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f31784a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f31785b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f31785b);
                return;
        }
    }
}
