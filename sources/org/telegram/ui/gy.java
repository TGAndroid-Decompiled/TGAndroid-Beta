package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class gy implements DialogInterface.OnDismissListener {
    public final int f48101a;
    public final EditTextBoldCursor f48102b;

    public gy(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f48101a = i7;
        this.f48102b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f48101a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f48102b);
                return;
            case 1:
                org.telegram.messenger.g0.v1(this.f48102b);
                return;
            default:
                org.telegram.messenger.g0.v1(this.f48102b);
                return;
        }
    }
}
