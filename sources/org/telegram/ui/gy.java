package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class gy implements DialogInterface.OnDismissListener {
    public final int f48182a;
    public final EditTextBoldCursor f48183b;

    public gy(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f48182a = i7;
        this.f48183b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f48182a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f48183b);
                return;
            case 1:
                org.telegram.messenger.g0.v1(this.f48183b);
                return;
            default:
                org.telegram.messenger.g0.v1(this.f48183b);
                return;
        }
    }
}
