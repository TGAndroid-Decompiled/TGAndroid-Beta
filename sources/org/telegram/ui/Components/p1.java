package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class p1 implements DialogInterface.OnDismissListener {
    public final int f29480a;
    public final EditText f29481b;

    public p1(EditText editText, int i10) {
        this.f29480a = i10;
        this.f29481b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29480a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f29481b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f29481b);
                return;
        }
    }
}
