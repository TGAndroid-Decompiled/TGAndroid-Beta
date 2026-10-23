package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f29456a;
    public final EditText f29457b;

    public q1(EditText editText, int i10) {
        this.f29456a = i10;
        this.f29457b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29456a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f29457b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f29457b);
                return;
        }
    }
}
