package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class p1 implements DialogInterface.OnDismissListener {
    public final int f27241a;
    public final EditText f27242b;

    public p1(EditText editText, int i10) {
        this.f27241a = i10;
        this.f27242b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f27241a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f27242b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f27242b);
                return;
        }
    }
}
