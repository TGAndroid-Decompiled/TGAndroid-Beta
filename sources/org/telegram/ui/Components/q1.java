package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f28478a;
    public final EditText f28479b;

    public q1(EditText editText, int i10) {
        this.f28478a = i10;
        this.f28479b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f28478a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f28479b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f28479b);
                return;
        }
    }
}
