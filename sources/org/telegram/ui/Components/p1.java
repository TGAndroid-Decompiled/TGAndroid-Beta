package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class p1 implements DialogInterface.OnDismissListener {
    public final int f26902a;
    public final EditText f26903b;

    public p1(EditText editText, int i10) {
        this.f26902a = i10;
        this.f26903b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f26902a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f26903b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f26903b);
                return;
        }
    }
}
