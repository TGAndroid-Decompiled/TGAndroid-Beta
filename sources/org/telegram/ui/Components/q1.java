package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f29949a;
    public final EditText f29950b;

    public q1(EditText editText, int i10) {
        this.f29949a = i10;
        this.f29950b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29949a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f29950b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f29950b);
                return;
        }
    }
}
