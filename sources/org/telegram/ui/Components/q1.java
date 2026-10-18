package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f29516a;
    public final EditText f29517b;

    public q1(EditText editText, int i10) {
        this.f29516a = i10;
        this.f29517b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29516a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f29517b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f29517b);
                return;
        }
    }
}
