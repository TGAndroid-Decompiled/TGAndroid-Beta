package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class p1 implements DialogInterface.OnDismissListener {
    public final int f27706a;
    public final EditText f27707b;

    public p1(EditText editText, int i10) {
        this.f27706a = i10;
        this.f27707b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f27706a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f27707b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f27707b);
                return;
        }
    }
}
