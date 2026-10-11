package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f30077a;
    public final EditText f30078b;

    public q1(EditText editText, int i10) {
        this.f30077a = i10;
        this.f30078b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f30077a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f30078b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f30078b);
                return;
        }
    }
}
