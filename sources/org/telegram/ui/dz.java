package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class dz implements DialogInterface.OnDismissListener {
    public final int f36698a;
    public final EditTextBoldCursor f36699b;

    public dz(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f36698a = i10;
        this.f36699b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f36698a) {
            case 0:
                org.telegram.messenger.i0.v1(this.f36699b);
                return;
            case 1:
                org.telegram.messenger.i0.v1(this.f36699b);
                return;
            default:
                org.telegram.messenger.i0.v1(this.f36699b);
                return;
        }
    }
}
