package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f29623a;
    public final EditText f29624b;

    public q1(EditText editText, int i10) {
        this.f29623a = i10;
        this.f29624b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29623a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f29624b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f29624b);
                return;
        }
    }
}
