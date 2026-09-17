package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class p1 implements DialogInterface.OnDismissListener {
    public final int f26908a;
    public final EditText f26909b;

    public p1(EditText editText, int i10) {
        this.f26908a = i10;
        this.f26909b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f26908a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f26909b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f26909b);
                return;
        }
    }
}
