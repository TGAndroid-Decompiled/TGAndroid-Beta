package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fy implements DialogInterface.OnDismissListener {
    public final int f47991a;
    public final EditTextBoldCursor f47992b;

    public fy(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f47991a = i7;
        this.f47992b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f47991a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f47992b);
                return;
            case 1:
                org.telegram.messenger.g0.v1(this.f47992b);
                return;
            default:
                org.telegram.messenger.g0.v1(this.f47992b);
                return;
        }
    }
}
