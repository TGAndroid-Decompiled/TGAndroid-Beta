package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class p1 implements DialogInterface.OnDismissListener {
    public final int f29485a;
    public final EditText f29486b;

    public p1(EditText editText, int i10) {
        this.f29485a = i10;
        this.f29486b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29485a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f29486b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f29486b);
                return;
        }
    }
}
