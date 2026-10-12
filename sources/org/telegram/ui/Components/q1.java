package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f29645a;
    public final EditText f29646b;

    public q1(EditText editText, int i10) {
        this.f29645a = i10;
        this.f29646b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29645a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f29646b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f29646b);
                return;
        }
    }
}
