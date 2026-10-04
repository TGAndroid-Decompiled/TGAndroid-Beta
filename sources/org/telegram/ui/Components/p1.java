package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class p1 implements DialogInterface.OnDismissListener {
    public final int f29479a;
    public final EditText f29480b;

    public p1(EditText editText, int i10) {
        this.f29479a = i10;
        this.f29480b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29479a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f29480b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f29480b);
                return;
        }
    }
}
