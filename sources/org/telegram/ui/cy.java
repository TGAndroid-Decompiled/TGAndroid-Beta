package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class cy implements DialogInterface.OnDismissListener {
    public final int f44917a;
    public final EditTextBoldCursor f44918b;

    public cy(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f44917a = i7;
        this.f44918b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f44917a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f44918b);
                return;
            case 1:
                org.telegram.messenger.g0.v1(this.f44918b);
                return;
            default:
                org.telegram.messenger.g0.v1(this.f44918b);
                return;
        }
    }
}
