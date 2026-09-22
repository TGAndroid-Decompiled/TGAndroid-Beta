package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class p1 implements DialogInterface.OnDismissListener {
    public final int f27223a;
    public final EditText f27224b;

    public p1(EditText editText, int i10) {
        this.f27223a = i10;
        this.f27224b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f27223a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f27224b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f27224b);
                return;
        }
    }
}
