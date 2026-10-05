package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class p1 implements DialogInterface.OnDismissListener {
    public final int f29566a;
    public final EditText f29567b;

    public p1(EditText editText, int i10) {
        this.f29566a = i10;
        this.f29567b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29566a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f29567b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f29567b);
                return;
        }
    }
}
