package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class o1 implements DialogInterface.OnDismissListener {
    public final int f29115a;
    public final EditText f29116b;

    public o1(EditText editText, int i10) {
        this.f29115a = i10;
        this.f29116b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29115a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f29116b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f29116b);
                return;
        }
    }
}
