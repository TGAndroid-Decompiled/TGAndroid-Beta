package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class dy implements DialogInterface.OnDismissListener {
    public final int f46491a;
    public final EditTextBoldCursor f46492b;

    public dy(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f46491a = i7;
        this.f46492b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f46491a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f46492b);
                return;
            case 1:
                org.telegram.messenger.g0.v1(this.f46492b);
                return;
            default:
                org.telegram.messenger.g0.v1(this.f46492b);
                return;
        }
    }
}
