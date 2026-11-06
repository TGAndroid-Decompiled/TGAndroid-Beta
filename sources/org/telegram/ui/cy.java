package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class cy implements DialogInterface.OnDismissListener {
    public final int f44912a;
    public final EditTextBoldCursor f44913b;

    public cy(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f44912a = i7;
        this.f44913b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f44912a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f44913b);
                return;
            case 1:
                org.telegram.messenger.g0.v1(this.f44913b);
                return;
            default:
                org.telegram.messenger.g0.v1(this.f44913b);
                return;
        }
    }
}
