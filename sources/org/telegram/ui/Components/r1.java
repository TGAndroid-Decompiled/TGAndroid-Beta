package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class r1 implements DialogInterface.OnDismissListener {
    public final int f26547a;
    public final EditText f26548b;

    public r1(EditText editText, int i10) {
        this.f26547a = i10;
        this.f26548b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f26547a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f26548b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f26548b);
                return;
        }
    }
}
