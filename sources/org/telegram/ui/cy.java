package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class cy implements DialogInterface.OnDismissListener {
    public final int f44913a;
    public final EditTextBoldCursor f44914b;

    public cy(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f44913a = i7;
        this.f44914b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f44913a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f44914b);
                return;
            case 1:
                org.telegram.messenger.g0.v1(this.f44914b);
                return;
            default:
                org.telegram.messenger.g0.v1(this.f44914b);
                return;
        }
    }
}
