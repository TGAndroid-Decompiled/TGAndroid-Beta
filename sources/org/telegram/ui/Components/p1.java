package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class p1 implements DialogInterface.OnDismissListener {
    public final int f27220a;
    public final EditText f27221b;

    public p1(EditText editText, int i10) {
        this.f27220a = i10;
        this.f27221b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f27220a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f27221b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f27221b);
                return;
        }
    }
}
