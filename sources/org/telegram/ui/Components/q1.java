package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f29543a;
    public final EditText f29544b;

    public q1(EditText editText, int i10) {
        this.f29543a = i10;
        this.f29544b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29543a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f29544b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f29544b);
                return;
        }
    }
}
