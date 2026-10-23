package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f29745a;
    public final EditText f29746b;

    public q1(EditText editText, int i10) {
        this.f29745a = i10;
        this.f29746b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29745a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f29746b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f29746b);
                return;
        }
    }
}
