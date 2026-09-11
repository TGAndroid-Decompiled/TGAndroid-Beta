package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f29542a;
    public final EditText f29543b;

    public q1(EditText editText, int i10) {
        this.f29542a = i10;
        this.f29543b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29542a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f29543b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f29543b);
                return;
        }
    }
}
