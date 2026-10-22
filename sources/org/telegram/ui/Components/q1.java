package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f29455a;
    public final EditText f29456b;

    public q1(EditText editText, int i10) {
        this.f29455a = i10;
        this.f29456b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29455a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f29456b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f29456b);
                return;
        }
    }
}
