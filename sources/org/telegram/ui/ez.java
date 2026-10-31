package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ez implements DialogInterface.OnDismissListener {
    public final int f37130a;
    public final EditTextBoldCursor f37131b;

    public ez(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f37130a = i10;
        this.f37131b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37130a) {
            case 0:
                org.telegram.messenger.i0.v1(this.f37131b);
                return;
            case 1:
                org.telegram.messenger.i0.v1(this.f37131b);
                return;
            default:
                org.telegram.messenger.i0.v1(this.f37131b);
                return;
        }
    }
}
