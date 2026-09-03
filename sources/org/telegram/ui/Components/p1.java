package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class p1 implements DialogInterface.OnDismissListener {
    public final int f29943a;
    public final EditText f29944b;

    public p1(EditText editText, int i10) {
        this.f29943a = i10;
        this.f29944b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29943a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f29944b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f29944b);
                return;
        }
    }
}
