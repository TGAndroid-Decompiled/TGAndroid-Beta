package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class cy implements DialogInterface.OnDismissListener {
    public final int f44888a;
    public final EditTextBoldCursor f44889b;

    public cy(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f44888a = i7;
        this.f44889b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f44888a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f44889b);
                return;
            case 1:
                org.telegram.messenger.g0.v1(this.f44889b);
                return;
            default:
                org.telegram.messenger.g0.v1(this.f44889b);
                return;
        }
    }
}
