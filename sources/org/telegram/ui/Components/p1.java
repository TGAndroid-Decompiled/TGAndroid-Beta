package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class p1 implements DialogInterface.OnDismissListener {
    public final int f29922a;
    public final EditText f29923b;

    public p1(EditText editText, int i10) {
        this.f29922a = i10;
        this.f29923b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29922a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f29923b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f29923b);
                return;
        }
    }
}
