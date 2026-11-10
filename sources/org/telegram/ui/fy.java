package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fy implements DialogInterface.OnDismissListener {
    public final int f45870a;
    public final EditTextBoldCursor f45871b;

    public fy(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f45870a = i7;
        this.f45871b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f45870a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f45871b);
                return;
            case 1:
                org.telegram.messenger.g0.v1(this.f45871b);
                return;
            default:
                org.telegram.messenger.g0.v1(this.f45871b);
                return;
        }
    }
}
